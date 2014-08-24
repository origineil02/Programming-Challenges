package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem36Test extends TestCase
{

  public Problem36Test(String testName)
  {
    super(testName);
  }

  public void testCorrectAnswer()
  {
    assertEquals((Integer) 872187, new Problem36.DoubleBasePalindrome().solve());
  }
}
