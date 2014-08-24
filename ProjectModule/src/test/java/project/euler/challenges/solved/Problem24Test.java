package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem24Test extends TestCase
{
  
  public Problem24Test(String testName)
  {
    super(testName);
  }
  
  public void testProblemStatement()
  {
    assertEquals("012", new Problem24.Lexigraphic().solve(1, "012"));
    assertEquals("021", new Problem24.Lexigraphic().solve(2, "012"));
    assertEquals("102", new Problem24.Lexigraphic().solve(3, "012"));
    assertEquals("120", new Problem24.Lexigraphic().solve(4, "012"));
    assertEquals("201", new Problem24.Lexigraphic().solve(5, "012"));
    assertEquals("210", new Problem24.Lexigraphic().solve(6, "012"));
  }
  
  public void testCorrectAnswer(){
    assertEquals("2783915460", new Problem24.Lexigraphic().solve(1000000, "0123456789"));
  }
}
