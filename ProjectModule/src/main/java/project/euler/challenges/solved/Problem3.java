package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {

  public static void main(String[] args) {

    //600851475143 - make the value
    BigInteger currentValue = BigInteger.valueOf(851475143);
    for (int i = 0; i < 600; i++) {
      currentValue = currentValue.add(BigInteger.valueOf(1000000000));
    }

    System.out.println(findLargestPrimeFactor(currentValue));
  }

  static int findLargestPrimeFactor(BigInteger currentValue) {
    

     final List<Integer> primeFactors = new ArrayList<Integer>(Util.primeFactors(currentValue));
     Collections.sort(primeFactors);
     return primeFactors.get(primeFactors.size() -1);
  }
}
