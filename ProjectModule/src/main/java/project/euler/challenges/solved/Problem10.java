package project.euler.challenges.solved;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;

public class Problem10 {

  //142913828922
  public static void main(final String[] args) {
    System.out.println(new SummationPrimes().solve(2000000));
  }

  static class SummationPrimes {

    public BigInteger solve(final Integer value) {
      final LinkedList<Integer> primes = new LinkedList<Integer>();
      primes.addFirst(2);

      BigInteger sum = BigInteger.valueOf(2);

      for (int number = 3; number < value; number += 2) {
        boolean fail = false;
        final Iterator<Integer> iter = primes.descendingIterator();
        while (iter.hasNext()) {
          final Integer prime = iter.next();
          if (0 == number % prime) {
            fail = true;
            break;
          }
        }

        if (!fail) {
          sum = sum.add(BigInteger.valueOf(number));
          primes.addFirst(number);
          //System.out.printf("Added %d : %s\n", number, sum.toString() );
        }
      }
      
      return sum;
    }
  }
}
