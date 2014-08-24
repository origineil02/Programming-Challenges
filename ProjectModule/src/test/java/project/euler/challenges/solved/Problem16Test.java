package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem16Test extends TestCase {
  
  public Problem16Test(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
    assertEquals((Integer)1366, new Problem16.PowerDigitSum().calculate());
  }
}
