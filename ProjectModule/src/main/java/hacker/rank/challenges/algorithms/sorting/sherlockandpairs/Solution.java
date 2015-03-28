package hacker.rank.challenges.algorithms.sorting.sherlockandpairs;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

  public static class SherlockAndPairs implements Runnable {

    public String solve(final Scanner in) {

      final int testCases = in.nextInt();
      final StringBuilder sb = new StringBuilder();
      final CombinationRepository repo = new CombinationRepository();
       final BigInteger two = new BigInteger("2");
      for (int i = 0; i < testCases; ++i) {
        final Map<Integer, BigInteger> map = new TreeMap<>();
        int size = in.nextInt();
        for (int j = 0; j < size; ++j) {

          final int v = in.nextInt();
          if (!map.containsKey(v)) {
            map.put(v, BigInteger.ZERO);
          }
          
          map.put(v, map.get(v).add(BigInteger.ONE));
        }

        BigInteger sum = BigInteger.ZERO;
        for (Entry<Integer, BigInteger> entry : map.entrySet()) {
          if (entry.getValue().compareTo(BigInteger.ONE) > 0) {
            
            BigInteger t = entry.getValue().multiply(entry.getValue().subtract(BigInteger.ONE));
            sum = sum.add(two.compareTo(entry.getValue()) == 0 ? two : t);
          }
        }
        sb.append(sum).append("\n");
      }
      
      return sb.toString();
    }

    private class CombinationRepository {

      private Map<Integer, BigInteger> map = new HashMap<>();
      private Map<Integer, BigInteger> factorials = new HashMap<>();
      
      public BigInteger getCombinations(int n) {
        if (!map.containsKey(n)) {
          map.put(n, combinations(n, 2));
        }

        return map.get(n);
      }
      public BigInteger getFactorial(int n){
        if(!factorials.containsKey(n)){
          factorials.put(n, factorial(n));
        }
        return factorials.get(n);
      }
      
      private BigInteger combinations(int n, int r) {
        final BigInteger nFactorial = getFactorial(n);
        final BigInteger rFactorial = getFactorial(r);
        final BigInteger nMinusRFactorial = getFactorial(n-r);
        final BigInteger denomiator = rFactorial.multiply(nMinusRFactorial);
        return nFactorial.divide(denomiator);
      }

      private BigInteger factorial(Integer value) {
        BigInteger product = BigInteger.ONE;
        for (int i = value; i > 0; --i) {
          product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
      }
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new SherlockAndPairs()).run();
  }
}
