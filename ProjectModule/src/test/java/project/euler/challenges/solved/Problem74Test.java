package project.euler.challenges.solved;

import junit.framework.TestCase;

/**
 *
 * @author Neil
 */
public class Problem74Test extends TestCase {
  
  public Problem74Test(String testName) {
    super(testName);
  }
  
  public void testCorrectAnswer() {
    assertEquals("402", new  Problem74.DigitFactorialChains().solve());
  }
}
