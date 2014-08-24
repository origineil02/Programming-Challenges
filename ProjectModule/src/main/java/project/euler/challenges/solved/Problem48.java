package project.euler.challenges.solved;

import java.math.BigInteger;

public class Problem48 {

  public static void main(final String[] args) {
    final String str = new SelfPowers().solve(1000);
    System.out.println(str.substring(str.length() - 10));
  }

  static class SelfPowers {

    public String solve(int value) {

      BigInteger sum = BigInteger.ZERO;
      for (int i = 1; i <= value; i++) {

        BigInteger power =  BigInteger.ONE ;
        for (int j = 1; j <= i; j++) {
          power = power.multiply(BigInteger.valueOf(i));
        }

        sum = sum.add(power);
      }

      return sum.toString();
    }
  }
}