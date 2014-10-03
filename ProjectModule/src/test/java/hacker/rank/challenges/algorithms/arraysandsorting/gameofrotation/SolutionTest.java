package hacker.rank.challenges.algorithms.arraysandsorting.gameofrotation;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "20 30 10 ";

    assertEquals("140", new Solution.GameOfRotation().solve(new Scanner(input)));
  }

}
