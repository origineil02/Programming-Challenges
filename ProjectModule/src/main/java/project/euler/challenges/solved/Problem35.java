package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class Problem35
{

  public static void main(final String[] args)
  {
    //TODO: speed up large value run-time
    //Answer = 55
    System.out.println(new CircularPrimes().solve(1000000).size());
  }

  static class CircularPrimes
  {

    public Set<Integer> solve(Integer value)
    {
      final Set<Integer> primes = Util.primes(BigInteger.valueOf(value));
      final Set<Integer> circularPrimes = new TreeSet<Integer>();

      for (Integer integer : primes)
      {
        if (integer < 10)
        {
          circularPrimes.add(integer);
          continue;
        }
        
        if (!circularPrimes.contains(integer))
        {
          process(integer, primes, circularPrimes);
        }
      }

      return circularPrimes;
    }

    private void process(final Integer integer, final Set<Integer> primes, final Set<Integer> circularPrimes)   
    {
      if(integer.toString().contains("0"))
      {
        return;
      }
      
      final Set<String> permutations = Util.rotate(integer);

      boolean circular = true;
      for (String string : permutations)
      {
        if (!primes.contains(Integer.parseInt(string)))
        {
//          final String str = String.format("permuatation: %s of original value %s is divisible by %s", string, integer.toString(), Util.getFactors(BigInteger.valueOf(Integer.parseInt(string))).toString());
          circular = false;
//          System.out.println(str);
          break;
        }
      }

      if (circular)
      {
        circularPrimes.add(integer);
      }
    }
  }
}
