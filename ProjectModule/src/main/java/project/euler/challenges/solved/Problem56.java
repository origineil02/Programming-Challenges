package project.euler.challenges.solved;

import java.math.BigInteger;
import project.euler.utils.Util;

public class Problem56
{

  private static boolean debug = false;

  public static void main(final String[] args)
  {
    System.out.println(new Problem56.DigitalSum().solve());
  }

  static class DigitalSum
  {

    public String solve()
    {
      BigInteger max = BigInteger.ZERO;

      for (int a = 0; a < 100; a++)
      {
        for (int b = 0; b < 100; b++)
        {
          BigInteger base = BigInteger.valueOf(a);
          BigInteger value = BigInteger.ONE;
          for (int i = 1; i < b; i++)
          {
            value = value.multiply(base);
            if (debug)
            {
              System.out.printf("\t%s ^ %d = %s\n", base.toString(), i, value.toString());
            }
          }

          final BigInteger digitalSum = Util.sumDigits(value.toString());

          if (debug)
          {
            final DigitalSumWrapper local = new DigitalSumWrapper(a, b, value, digitalSum);
            System.out.println(local);
          }

          if (max.compareTo(digitalSum) < 0)
          {
            max = digitalSum;
          }

        }
      }

      return max.toString();
    }

    private class DigitalSumWrapper
    {

      private final int a;
      private final int b;
      private final BigInteger value;
      private final BigInteger sum;

      public DigitalSumWrapper(final int a, final int b,
                               final BigInteger value, final BigInteger sum)
      {
        this.a = a;
        this.b = b;
        this.sum = sum;
        this.value = value;
      }

      public int getA()
      {
        return a;
      }

      public int getB()
      {
        return b;
      }

      public BigInteger getSum()
      {
        return sum;
      }

      @Override
      public String toString()
      {
        return String.format("%d ^ %d : %s \ndigits sum to %s\n", a, b, value, sum);
      }
    }
  }
}
