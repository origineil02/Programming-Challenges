package hacker.rank.challenges.algorithms.search.icecreamparlor;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "2\n"
            + "4\n"
            + "5\n"
            + "1 4 5 3 2\n"
            + "4\n"
            + "4\n"
            + "2 2 4 3";

    assertEquals("1 4\n1 2\n", new Solution.IceCreamParlor().solve(new Scanner(input)));

  }
}
