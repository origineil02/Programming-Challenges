package hacker.rank.challenges.algorithms.warmup.twostrings;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {

    final String input = "2\n"
            + "hello\n"
            + "world\n"
            + "hi\n"
            + "world";

    assertEquals("YES\nNO", new Solution.TwoStrings().solve(new Scanner(input)));
  }
}
