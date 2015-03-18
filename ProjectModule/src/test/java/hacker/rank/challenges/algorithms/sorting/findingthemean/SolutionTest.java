package hacker.rank.challenges.algorithms.sorting.findingthemean;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {

    final String input = "7\n0 1 2 4 6 5 3";
    assertEquals("3", new Solution.FindingTheMean().solve(new Scanner(input)));
  }
}
