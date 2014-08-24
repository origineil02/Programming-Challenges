package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem10Test extends TestCase {

  public Problem10Test(String testName) {
    super(testName);
  }

  public void testCaseFromProblemStatement() {
    assertEquals("17", new Problem10.SummationPrimes().solve(10).toString());
  }
}
