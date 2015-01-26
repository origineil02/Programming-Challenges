package attempt.hacker.rank.challenges.algorithms.summationandalgebra.summationtheNseries;

import java.util.Scanner;
import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase{
  
  @Test
  public void testSample() {
    assertEquals("4\n1", new Solution.SummationNSeries().solve(new Scanner("2\n2\n1")));
  }
}
