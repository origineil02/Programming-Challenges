package attempt.hacker.rank.challenges.algorithms.geometry.sherlockandplanes;

import java.util.Scanner;
import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
  
  public void testSample() {
      Assert.assertEquals("YES", new Solution.SherlockAndPlanes().solve(new Scanner("1\n1 2 0\n2 3 0\n4 0 0\n0 0 0")));
  }
  
}
