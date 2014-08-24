package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem53Test extends TestCase
{
  
  public Problem53Test(String testName)
  {
    super(testName);
  }
  
  public void testCorrectAnswer()
  {
   assertEquals("4075", new Problem53.CombinatoricSelections().solve());
  }
}
