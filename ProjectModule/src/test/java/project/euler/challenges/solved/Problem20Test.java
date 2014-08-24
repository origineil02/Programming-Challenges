package project.euler.challenges.solved;

import junit.framework.TestCase;
import project.euler.utils.Util;

public class Problem20Test extends TestCase {

  public Problem20Test(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
    final String str = Util.factorial(10).toString();
    assertEquals((Integer) 27, Problem20.sumCharacters(str));
  }

  public void testAnswer() {
    final String str = Util.factorial(100).toString();
    assertEquals((Integer) 648, Problem20.sumCharacters(str));
  }
}
