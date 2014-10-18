package project.euler.challenges.solved;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class Problem87Test extends TestCase {

  public void testCaseFromProblemStatement() {
    assertEquals("4", new Problem87.PrimePowerTriples().solve(50));
  }
}
