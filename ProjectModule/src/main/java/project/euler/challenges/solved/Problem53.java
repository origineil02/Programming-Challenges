package project.euler.challenges.solved;

import java.math.BigInteger;
import project.euler.utils.Util;

public class Problem53
{

  public static void main(final String[] args)
  {
    System.out.println(new CombinatoricSelections().solve());
  }

  static class CombinatoricSelections
  {

    public String solve()
    {
      final BigInteger pivot = BigInteger.valueOf(1000000);
      Integer count = 0;
      for (int n = 2; n <= 100; n++)
      {
        for (int r = n - 1; r > 1; --r)
        {
          if(pivot.compareTo(Util.combinations(n, r)) < 0)
          {
            count++;
          }
        }
      }
      return count.toString();
    }
  }
}