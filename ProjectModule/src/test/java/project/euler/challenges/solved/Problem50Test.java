package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem50Test extends TestCase
{

  public Problem50Test(String testName)
  {
    super(testName);
  }

  public void test100()
  {
    assertEquals((Integer) 41, new Problem50.ConsecutivePrimeSum().solve(100));
  }

  public void test1000()
  {
    assertEquals((Integer) 953, new Problem50.ConsecutivePrimeSum().solve(1000));
  }
}
