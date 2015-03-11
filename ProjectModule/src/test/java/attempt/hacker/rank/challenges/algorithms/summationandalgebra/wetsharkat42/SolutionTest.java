package attempt.hacker.rank.challenges.algorithms.summationandalgebra.wetsharkat42;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "2\n3\n4";
    assertEquals("6\n8", new Solution.WetShark().solve(new Scanner(input)));
  }
  
  public void testBoundary() {

    long v = ((Double)(Math.pow(10, 3))).longValue();
    final String input = "1\n" + v;
    assertEquals("1", new Solution.WetShark().solve(new Scanner(input)));
  }
  
  public void testx() {

    final String input = "1\n1000";
    assertEquals("1", new Solution.WetShark().solve(new Scanner(input)));
  }
}
