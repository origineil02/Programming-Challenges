package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Problem37 {

  public static void main(final String[] args) {
    System.out.println(new TruncatablePrimes().solve());
  }

  static class TruncatablePrimes {

    public Integer solve() {
      Integer sum = 0;

      final Set<Integer> primes = Util.primes(BigInteger.valueOf(740000));
      final List<Integer> truncatablePrimes = new ArrayList<Integer>();
      int count = 0;
      for (Integer integer : primes) {
        if (isTruncatable(integer, primes)) {
          truncatablePrimes.add(integer);
          sum+=integer;
          count++;
        }
      }
      
      if(11 != count)
      {
        throw new IllegalStateException("Problem statement reveals 11 truncatable primes exist.");
      }
        
      System.out.println(truncatablePrimes);
      return sum;
    }

    boolean isTruncatable(final Integer integer, final Set<Integer> primes) {
      final String str = integer.toString();

      if(integer < 10)
      {
        return false;
      }
      
      for (int i = 1, j = str.length() - 1; j > 0; i++, --j) {
        final String left = str.substring(0, i);
        final String right = str.substring(j);
        
        final Integer x = Integer.parseInt(left);
        final Integer y = Integer.parseInt(right);
        if (!primes.contains(x) || !primes.contains(y)) {
          return false;
        }
      }
      return true;
    }
  }
}
