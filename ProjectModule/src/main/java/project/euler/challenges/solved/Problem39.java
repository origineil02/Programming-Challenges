package project.euler.challenges.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import project.euler.models.PerimeterDimensions;
import project.euler.utils.Util;

public class Problem39
{
  //840 : 8

  public static void main(final String[] args)
  {
    final RightTrianglePerimeter instance = new RightTrianglePerimeter();
    Integer max = Integer.MIN_VALUE;
    Integer answer = -1;
    for (int i = 1; i <= 1000; i++)
    {
      final Integer dimensionCount = instance.solve2(i);
      max = Math.max(max, dimensionCount);
      if(max.equals(dimensionCount))
      {
        answer = i;
      }
//      System.out.printf("%d : %d\n", i, dimensionCount);
    }

    System.out.printf("%d with %d\n", answer, max);
  }

  static class RightTrianglePerimeter
  {

    private final Map<Integer, Set<PerimeterDimensions>> map;

    /*
     a + b + c = 120
     c2 = a2 + b2
     c = sqrt (a2 + b2)
     */
    public RightTrianglePerimeter()
    {
      map = new HashMap<Integer, Set<PerimeterDimensions>>();
      init();
    }

    private void init()
    {
      boolean terminate = false;
      for (int i = 1; i <= 1000; i++)
      {
        for (int a = 1; a < i / 2; a++)
        {
          for (int b = 1; !terminate; b++)
          {
            final Double x = Math.pow(a, 2) + Math.pow(b, 2);
            Double y = Math.sqrt(x);

            Integer c = y.intValue();

            if (a + b + c == i
                    && isWholeNumber(y))
            {
              if (!map.containsKey(i))
              {
                map.put(i, new HashSet<PerimeterDimensions>());
              }

              final List<Integer> dimensions = new ArrayList<Integer>(Arrays.asList(a, b, c));
              Collections.sort(dimensions);
              final Iterator<Integer> iterator = dimensions.iterator();
              map.get(i).add(new PerimeterDimensions(iterator.next(), iterator.next(), iterator.next()));
            }

            if (a + b + c > 1000)
            {
              terminate = true;
            }
          }
          terminate = false;
        }
      }
    }

    public Integer solve2(Integer value)
    {
      return map.containsKey(value) ? map.get(value).size() : 0;
    }

    public Integer solveBruteForce(Integer value)
    {
      final Set<PerimeterDimensions> dimensions = new HashSet<PerimeterDimensions>();
      for (int i = 1; i < value / 2; i++)
      {
        for (int j = 1; j < value / 2; j++)
        {
          for (int k = 1; k < value / 2; k++)
          {
            Integer sum = i + j + k;

//             System.out.printf("{%d, %d, %d} = %d\n", i, j, k, sum);
            if (sum.equals(value))
            {
              if (Util.isRightTriangle(i, j, k))
              {
//                System.out.printf("{%d, %d, %d} = %d\n", i, j, k, sum);
                final Set<Integer> sortedDimensions = new TreeSet<Integer>(Arrays.asList(i, j, k));
                final Iterator<Integer> iterator = sortedDimensions.iterator();
                dimensions.add(new PerimeterDimensions(iterator.next(), iterator.next(), iterator.next()));
              }
            }
          }
        }
      }
      return dimensions.size();
    }

    private boolean isWholeNumber(Double x)
    {
      final String str = x.toString();
      final String[] strArray = str.split("\\.");
      return strArray[1].equals("0");
    }
  }
}
