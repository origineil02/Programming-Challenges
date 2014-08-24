package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem56Test extends TestCase
{
  
  public Problem56Test(String testName)
  {
    super(testName);
  }

  public void testPotentialAnswer()
  {
    assertEquals("972", new Problem56.DigitalSum().solve());
  }
}
