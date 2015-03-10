package attempt.hacker.rank.challenges.algorithms.summationandalgebra.wetsharkat42;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "2\n3\n4";
    assertEquals("6\n8", new Solution.WetShark().solve(new Scanner(input)));
  }
  
}
