package hacker.rank.challenges.algorithms.search.flowers;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample1() {
    final String input = "3 3\n2 5 6";

    assertEquals("13", new Solution.Flowers().solve(new Scanner(input)));
  }

  @Test
  public void testSample2() {
    final String input = "3 2\n2 5 6";

    assertEquals("15", new Solution.Flowers().solve(new Scanner(input)));
  }
}
