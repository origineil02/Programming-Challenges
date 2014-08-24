package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem30Test extends TestCase {
  
  public Problem30Test(String testName) {
    super(testName);
  }
  
  public void testCorrectAnswer() {
    assertEquals((Integer) 443839, new Problem30.DigitFifthPower().solve());
  }
}
