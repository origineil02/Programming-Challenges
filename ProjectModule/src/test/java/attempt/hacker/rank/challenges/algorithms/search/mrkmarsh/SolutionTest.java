package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "4 5\n"
            + ".....\n"
            + ".x.x.\n"
            + ".....\n"
            + ".....";

    assertEquals("[....., .x.x., ....., .....]", new Solution.MrKMarsh().solve(new Scanner(input)));
  }

}
