package project.euler.challenges.solved;

import java.math.BigInteger;

public class Problem14 {

  final private static BigInteger TWO = BigInteger.valueOf(2);
  final private static BigInteger THREE = BigInteger.valueOf(3);
  public static void main(final String[] args) {

    Integer max = Integer.MIN_VALUE;
    Integer value = 0;
    for (int i = 1; i < 1000000; i++) {
      Integer sequenceLength = collatz(i);
      if (max < sequenceLength) {
        value = i;
        max = sequenceLength;
      }
    }

    System.out.println(value);
    System.out.println(max);
  }

  static Integer collatz(Integer value) {
    Integer sequence = 1;
    BigInteger bigInteger = BigInteger.valueOf(value);
    while (bigInteger.intValue() != 1) {
      if (BigInteger.ZERO == bigInteger.mod(TWO)) {
        bigInteger = bigInteger.divide(TWO);
      }
      else {
        bigInteger = bigInteger.multiply(THREE);;
        bigInteger = bigInteger.add(BigInteger.ONE);;
      }
      sequence++;
    }
    return sequence;
  }
}
