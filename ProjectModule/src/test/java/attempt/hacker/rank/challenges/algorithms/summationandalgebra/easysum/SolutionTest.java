package attempt.hacker.rank.challenges.algorithms.summationandalgebra.easysum;

import java.util.Scanner;
import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase{
  
  @Test
  public void testSample() {
    assertEquals("20\n10\n10", new Solution.EasySum().solve(new Scanner("3\n10 5\n10 3\n5 5")));
  }
  
}
