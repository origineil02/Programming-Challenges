package project.euler.challenges.solved;

import java.util.Set;
import project.euler.utils.Util;

public class Problem52
{

  public static void main(final String[] args)
  {
    System.out.println(new PermutationMultiple().solve(6));
  }

  static class PermutationMultiple
  {

    public String solve(int maxMultiple)
    {

      for (int i = 125874;; i++)
      {
        final Set<String> permutations = Util.permutate(i);
        boolean multiplesArePermutation = true;
        for (Integer j = 2; j <= maxMultiple; j++)
        {
          final Integer multiple = i * j;
          if (!permutations.contains(multiple.toString()))
          {
            multiplesArePermutation = false;
            j = maxMultiple + 1;
          }
        }

        if (multiplesArePermutation)
        {
          System.out.printf("For %d\n", i);
          for (Integer j = 2; j <= maxMultiple; j++)
          {
            System.out.printf("  : %d * %d = %d\n",i, j, i * j);
          }
          System.out.println("");
          return String.valueOf(i);
        }
      }
    }
  }
}
