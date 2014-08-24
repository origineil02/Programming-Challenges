package project.euler.challenges.solved;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class Problem1Test extends TestCase {

  public Problem1Test(String testName) {
    super(testName);
  }

  public void testCaseFromProblemStatement() {
    assertEquals("233168", new Problem1.SummationOfMultiples().solve());
  }
}
