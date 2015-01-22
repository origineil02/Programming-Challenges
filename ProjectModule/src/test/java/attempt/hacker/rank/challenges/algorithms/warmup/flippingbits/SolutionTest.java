package attempt.hacker.rank.challenges.algorithms.warmup.flippingbits;

import attempt.hacker.rank.challenges.algorithms.warmup.flippingbits.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
  
  public void testSample() {
    final String input = "3\n2147483647\n1\n0";
    assertEquals("2147483648\n4294967294\n4294967295", new Solution.FlippingBits().solve(new Scanner(input)));
  }
  
}
