package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Problem34
{

  public static void main(final String[] args)
  {
    //40730
    System.out.println(new DigitFactorial().solve());
  }

  static class DigitFactorial
  {

    private Map<Integer, BigInteger> factorials = new HashMap<Integer, BigInteger>();

    public Integer solve()
    {
      Integer sum = 0;
      for (BigInteger i = BigInteger.valueOf(3);; i = i.add(BigInteger.ONE))
      {

        final String str = i.toString();
        BigInteger digitSum = BigInteger.ZERO;
        for (Character c : str.toCharArray())
        {
          final Integer x = Integer.parseInt(c.toString());

          if (factorials.containsKey(x))
          {
            digitSum = digitSum.add(factorials.get(x));
          }
          else
          {
            final BigInteger factorial = Util.factorial(x);
            digitSum = digitSum.add(factorial);
            factorials.put(x, factorial);
          }
        }

        if (digitSum.equals(i))
        {
          sum += digitSum.intValue();
        }

        //TODO: find a better termination condition
        final Integer left = i.toString().length();
        final Integer right = digitSum.toString().length();
        final Integer larger = Math.max(left, right);
        final Integer smaller = Math.min(left, right);

        if (larger - smaller > 5 && !str.contains("9"))
        {
          break;
        }
      }
      return sum;
    }
  }
}
