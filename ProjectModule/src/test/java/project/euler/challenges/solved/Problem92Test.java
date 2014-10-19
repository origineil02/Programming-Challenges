package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem92Test extends TestCase {

  public void testProblemStatement() {
    assertEquals("8581146", new Problem92.SquareDigitChains().solve());
  }
}
