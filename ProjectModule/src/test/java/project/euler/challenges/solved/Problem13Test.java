package project.euler.challenges.solved;

import java.io.FileNotFoundException;
import junit.framework.TestCase;

public class Problem13Test extends TestCase {
  
  public Problem13Test(String testName) {
    super(testName);
  }
  
  public void testSomeMethod() throws FileNotFoundException {
    assertEquals("5537376230", Problem13.sum());
  }
}
