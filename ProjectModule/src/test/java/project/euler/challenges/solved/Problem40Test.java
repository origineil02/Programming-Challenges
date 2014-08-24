package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem40Test extends TestCase {

  public Problem40Test(String testName) {
    super(testName);
  }

  public void testCorrectAnser() {
    assertEquals((Integer)210, new Problem40.ChampernowneConstant().solve());
  }

  public void testSequenceGeneration() {
    System.out.println(new Problem40.ChampernowneConstant().generateSequence(10));
    assertEquals(".12345678910", new Problem40.ChampernowneConstant().generateSequence(10));
    assertEquals(".1234567891011121314151617181920", new Problem40.ChampernowneConstant().generateSequence(20));
  }
}
