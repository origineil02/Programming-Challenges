package hacker.rank.challenges.algorithms.strings.funnystring;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testProblemStatement() {

    final String input = "2\nacxz\nbcxz";

    assertEquals("Funny\nNot Funny", new Solution.FunnyString().solve(new Scanner(input)));
  }
}
