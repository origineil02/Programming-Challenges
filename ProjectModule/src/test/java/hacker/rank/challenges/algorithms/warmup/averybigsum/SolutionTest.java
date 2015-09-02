package hacker.rank.challenges.algorithms.warmup.averybigsum;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
  
  public void testProblemStatement() {

    final String input = "5\n1000000001 1000000002 1000000003 1000000004 1000000005";

    assertEquals("5000000015", new Solution.AVeryBigSum().solve(new Scanner(input)));
  }  
}
