package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem14Test extends TestCase {

  public Problem14Test(String testName) {
    super(testName);
  }

  public void test13() {
    assertEquals(new Integer(10), Problem14.collatz(13));
  }

  public void test1000000() {
    assertEquals(new Integer(153), Problem14.collatz(1000000));
  }
}
