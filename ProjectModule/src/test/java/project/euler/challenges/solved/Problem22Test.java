package project.euler.challenges.solved;

import java.io.FileNotFoundException;
import junit.framework.TestCase;

public class Problem22Test extends TestCase {
  
  public Problem22Test(String testName) {
    super(testName);
  }
  
  public void testSomeMethod() {
    assertEquals((Integer)53, new Problem22.NameScore().calculate("\"COLIN\""));
  }
  public void testCorrectAnswer() throws FileNotFoundException {
    assertEquals((Integer)871198282, Problem22.processData());
  }
  
}
