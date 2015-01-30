package hacker.rank.challenges.algorithms.implementation.cavitymap;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {
    final String input = "4\n"
            + "1112\n"
            + "1912\n"
            + "1892\n"
            + "1234";

    final String output = "1112\n1X12\n18X2\n1234\n";
    assertEquals(output, new Solution.CavityMap().solve(new Scanner(input)));
  }
}
