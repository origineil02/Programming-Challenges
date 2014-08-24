package project.euler.challenges.solved;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import junit.framework.TestCase;
import project.euler.utils.Util;

public class Problem35Test extends TestCase
{

  public Problem35Test(String testName)
  {
    super(testName);
  }

  public void testRotate()
  {
    final Set<String> rotations = Util.rotate(197);
    assertEquals(3, rotations.size());
  }
  
  public void testCase100()
  {
    final Set<Integer> expectedValues = new TreeSet<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97));
    final Set<Integer> actualValues = new Problem35.CircularPrimes().solve(100);
    assertEquals(13, actualValues.size());
    assertEquals(expectedValues, actualValues);
  }

  public void testCase1000()
  {
    final Set<Integer> actualValues = new Problem35.CircularPrimes().solve(1000);
    assertEquals(25, actualValues.size());
  }

  public void testCase10000()
  {
    final Set<Integer> actualValues = new Problem35.CircularPrimes().solve(10000);
    assertEquals(33, actualValues.size());
  }
}
