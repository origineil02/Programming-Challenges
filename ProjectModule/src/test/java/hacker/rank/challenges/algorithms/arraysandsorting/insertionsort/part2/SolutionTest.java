package hacker.rank.challenges.algorithms.arraysandsorting.insertionsort.part2;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "6\n1 4 3 5 6 2";
    
    assertEquals("1 4 3 5 6 2\n1 3 4 5 6 2\n1 3 4 5 6 2\n1 3 4 5 6 2\n1 2 3 4 5 6\n", new Solution.InsertionSortPart2().solve(new Scanner(input)));
  }
}
