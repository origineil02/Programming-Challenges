package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem55Test extends TestCase
{
  
  public Problem55Test(String testName)
  {
    super(testName);
  }

  public void testCorrectAnswer()
  {
    assertEquals("249", new Problem55.LychrelNumbers().solve());
  }
}
