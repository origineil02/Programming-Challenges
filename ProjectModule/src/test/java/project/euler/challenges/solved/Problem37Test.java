package project.euler.challenges.solved;

import java.math.BigInteger;
import junit.framework.TestCase;
import project.euler.utils.Util;

public class Problem37Test extends TestCase {
  
  public Problem37Test(String testName) {
    super(testName);
  }
  
  public void testSomeMethod() {
    assertTrue(new Problem37.TruncatablePrimes().isTruncatable(3797, Util.primes(BigInteger.valueOf(4000))));
  }
}
