package hacker.rank.challenges.algorithms.geometry.rectangulargame;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "2 3\n"
            + "3 7\n"
            + "4 1";

    assertEquals("2", new Solution.RectangularGame().solve(new Scanner(input)));
  }
}
