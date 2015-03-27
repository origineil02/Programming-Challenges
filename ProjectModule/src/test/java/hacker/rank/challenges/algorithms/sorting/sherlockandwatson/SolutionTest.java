package hacker.rank.challenges.algorithms.sorting.sherlockandwatson;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {
    final String input = "3 2 3\n"
            + "1 2 3\n"
            + "0\n"
            + "1\n"
            + "2";

    assertEquals("2\n3\n1\n", new Solution.SherlockAndWatson().solve(new Scanner(input)));
  }

  public void test() {
    final String input = "3 3 3\n"
            + "1 2 3\n"
            + "0\n"
            + "1\n"
            + "2";

    assertEquals("1\n2\n3\n", new Solution.SherlockAndWatson().solve(new Scanner(input)));
  }
}
