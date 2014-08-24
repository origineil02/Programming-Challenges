package project.euler.challenges.solved;

import java.math.BigInteger;
import junit.framework.TestCase;

public class Problem3Test extends TestCase {
  
  public Problem3Test(String testName) {
    super(testName);
  }
  
  public void testSomeMethod() {
        BigInteger currentValue = BigInteger.valueOf(851475143);
    for (int i = 0; i < 600; i++) {
      currentValue = currentValue.add(BigInteger.valueOf(1000000000));
    }
    
    assertEquals(6857, Problem3.findLargestPrimeFactor(currentValue));
  }
}
