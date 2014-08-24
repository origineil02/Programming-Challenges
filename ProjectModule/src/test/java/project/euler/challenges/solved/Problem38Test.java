package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem38Test extends TestCase {
  
  public Problem38Test(String testName) {
    super(testName);
  }
  
  public void testCorrectAnswer() {
    assertEquals("932718654", new Problem38.PandigitalMultiples().solve());
  }
}
