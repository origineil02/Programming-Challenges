package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem39Test extends TestCase
{

  public Problem39Test(String testName)
  {
    super(testName);
  }

  public void testProblemStatementTestCase()
  {
    assertEquals((Integer) 3, new Problem39.RightTrianglePerimeter().solveBruteForce(120));
  }

  public void test()
  {
    assertEquals((Integer) 3, new Problem39.RightTrianglePerimeter().solve2(120));
  }

  public void testCorrectAnswer()
  {
    Integer max = Integer.MIN_VALUE;

    final Problem39.RightTrianglePerimeter instance = new Problem39.RightTrianglePerimeter();
    for (int i = 1; i <= 1000; i++)
    {
      final Integer dimensionCount = instance.solve2(i);
      max = Math.max(max, dimensionCount);
//      System.out.printf("%d : %d\n", i, dimensionCount);
    }

    assertEquals((Integer) 8, max);
  }
}
