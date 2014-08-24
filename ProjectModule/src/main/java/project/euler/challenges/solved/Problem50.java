package project.euler.challenges.solved;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import project.euler.utils.Util;

public class Problem50
{

  public static void main(final String[] args)
  {
    //From 3 to 545 (542) sums to 997651
    System.out.println(new ConsecutivePrimeSum().solve(1000000));
  }

  static class ConsecutivePrimeSum
  {

    public Integer solve(int target)
    {
      final Set<Integer> primes = Util.primes(BigInteger.valueOf(target));
      final List<Integer> data = new ArrayList<Integer>(primes);
      Collections.sort(data);

      final LinkedList<Integer> sorted = new LinkedList<Integer>(data);

      int consecutiveLength = 0;
      int value = 0;
      for (int i = 0; i < sorted.size(); i++)
      {
        Integer sum = 0;
        for (int j = i; j < sorted.size(); j++)
        {
          sum += sorted.get(j);

          if (sum < target)
          {
            if (primes.contains(sum))
            {
              //System.out.printf("From %d to %d (%d) sums to %d\n", i, j, j - i, sum);
              int x = j - i;
              if (consecutiveLength < x)
              {
                consecutiveLength = x;
                value = sum;
              }
            }
          }
          else
          {
            break;
          }
        }
      }

      return value;
    }
  }
}
