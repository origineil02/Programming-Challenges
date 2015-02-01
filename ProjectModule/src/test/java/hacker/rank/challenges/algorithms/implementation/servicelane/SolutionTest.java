package hacker.rank.challenges.algorithms.implementation.servicelane;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {
    String input = "8 5\n"
            + "2 3 1 2 3 2 3 3\n"
            + "0 3\n"
            + "4 6\n"
            + "6 7\n"
            + "3 5\n"
            + "0 7";

    final String expected = "1\n"
            + "2\n"
            + "3\n"
            + "2\n"
            + "1\n";
    
    assertEquals(expected, new Solution.ServiceLane().solve(new Scanner(input)));
  }
}
