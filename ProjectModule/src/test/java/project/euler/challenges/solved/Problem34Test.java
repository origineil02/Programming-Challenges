package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem34Test extends TestCase
{
  
  public Problem34Test(String testName)
  {
    super(testName);
  }

  public void testCorrectAnswer()
  {
    assertEquals((Integer)40730, new Problem34.DigitFactorial().solve());
  }
}
