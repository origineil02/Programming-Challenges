package hacker.rank.challenges.algorithms.sorting.gameofrotation;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "3\n"
            + "20 30 10 ";

    assertEquals("140", new Solution.GameOfRotation().solve(new Scanner(input)));
  }
}
