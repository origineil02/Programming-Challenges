package hacker.rank.challenges.algorithms.arraysandsorting.sherlockandarray;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSomeMethod() {
    final String input = "2\n"
            + "3\n"
            + "1 2 3\n"
            + "4\n"
            + "1 2 3 3";

    assertEquals("NO\nYES\n", new Solution.SherlockAndArray().solve(new Scanner(input)));
  }
}
