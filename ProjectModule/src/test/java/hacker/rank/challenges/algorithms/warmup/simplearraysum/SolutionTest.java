package hacker.rank.challenges.algorithms.warmup.simplearraysum;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testProblemStatement() {

    final String input = "6\n1 2 3 4 10 11";

    assertEquals("31", new Solution.SimpleArraySum().solve(new Scanner(input)));
  }
}
