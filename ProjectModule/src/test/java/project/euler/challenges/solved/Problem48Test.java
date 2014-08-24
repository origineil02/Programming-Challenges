package project.euler.challenges.solved;

import junit.framework.TestCase;
import project.euler.challenges.solved.Problem48.SelfPowers;

public class Problem48Test extends TestCase {

  public Problem48Test(String testName) {
    super(testName);
  }

  public void testCaseFromProblemStatement_Value10() {
    assertEquals("10405071317", new Problem48.SelfPowers().solve(10));
  }

  public void testCorrectAnswer() {
    final String str = new SelfPowers().solve(1000);
    final String actual = str.substring(str.length() - 10);
    assertEquals("9110846700", actual);
  }
}
