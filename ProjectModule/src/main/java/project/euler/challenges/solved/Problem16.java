package project.euler.challenges.solved;

import java.math.BigInteger;

public class Problem16 {
  
  public static void main(final String[] args) {
    
    final PowerDigitSum instance = new PowerDigitSum();
    
    System.out.println(new PowerDigitSum().calculate());
  } 
  
  static class PowerDigitSum {
    
    public Integer calculate() {
      BigInteger x = BigInteger.ONE;
    for (int i = 1; i <= 100; i++) {
      final Double d = Math.pow(2, 10);
      x = x.multiply(BigInteger.valueOf(d.intValue()));
    }
    
    final String str = x.toString().replace("0", "");
    Integer sum = 0;
    for (Character c : str.toCharArray()) {
      sum += Integer.parseInt(c.toString());
    }
    return sum;
    }
  }
}
