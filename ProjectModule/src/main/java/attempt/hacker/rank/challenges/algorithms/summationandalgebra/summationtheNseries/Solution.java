package attempt.hacker.rank.challenges.algorithms.summationandalgebra.summationtheNseries;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

  public static class SummationNSeries implements Runnable {

    private Long mod() {
      return ((Double) Math.pow(10, 9)).longValue();
    }

    private String solveLong(Scanner in) {
      /* 

       Status

       - Time exceeded X 1
       - Runtime error X 2
       - Wrong Answer X 1

       */
      final long mod = ((Double) Math.pow(10, 9)).longValue();

      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();

      while (0 < testCases--) {
        int n = in.nextInt();
        long sum = 0;
        while (0 < n) {
          sum += (n * n) - ((n - 1) * (n - 1));
          n--;
        }

        sb.append(sum % mod).append("\n");
      }
      return sb.toString().trim();
    }

    public String solve(final Scanner in) {

      /* 

       Status

       - Time exceeded X 2
       - Runtime error X 2

       */
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();

      while (0 < testCases--) {
        int n = in.nextInt();
        BigInteger sum = BigInteger.ZERO;

        while (0 < n) {
          final Integer f = (n * n) - ((n - 1) * (n - 1));
          sum = sum.add(new BigInteger(f.toString()));
          n--;
        }

        sb.append(sum.mod(BigInteger.valueOf(mod()))).append("\n");
      }

      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new SummationNSeries()).run();
  }
}
