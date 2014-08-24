package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem52Test extends TestCase
{

  public Problem52Test(String testName)
  {
    super(testName);
  }

  public void testCorrectAnswer()
  {
    assertEquals("142857", new Problem52.PermutationMultiple().solve(6));
  }
  
  public void testProblemStatementExample()
  {
    assertEquals("125874", new Problem52.PermutationMultiple().solve(2));
  }
}
