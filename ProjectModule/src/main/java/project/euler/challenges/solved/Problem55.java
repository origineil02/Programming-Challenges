package project.euler.challenges.solved;

import java.math.BigInteger;
import project.euler.utils.Util;

public class Problem55
{

  private static boolean debug = false;

  public static void main(final String[] args)
  {
    System.out.println(new Problem55.LychrelNumbers().solve());
  }

  static class LychrelNumbers
  {

    public String solve()
    {
      int count = 0;
      for (Integer i = 1; i < 10000; i++)
      {
        if (debug)
        {
          System.out.println(i);
        }
        if (isLychrel(BigInteger.valueOf(i), 1))
        {
          ++count;
        }
      }
      return String.valueOf(count);
    }

    private boolean isLychrel(final BigInteger i, int depth)
    {
      if (depth > 50)
      {
        return true;
      }

      final BigInteger reverse = new BigInteger(Util.reverse(i.toString()));
      final BigInteger sum = i.add(reverse);

      if (debug)
      {
        for (int j = depth; j >= 0; --j)
        {
          System.out.print(" ");
        }

        System.out.printf("%s + %s = %s @ %d\n", i.toString(), reverse.toString(), sum.toString(), depth);
      }
      
      if (Util.isPalindrome(sum.toString()))
      {
        return false;
      }
      else
      {
        return isLychrel(sum, ++depth);
      }
    }
  }
}
