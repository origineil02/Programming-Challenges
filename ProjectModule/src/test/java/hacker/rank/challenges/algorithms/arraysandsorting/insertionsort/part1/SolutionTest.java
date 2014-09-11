package hacker.rank.challenges.algorithms.arraysandsorting.insertionsort.part1;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "5\n2 4 6 8 3";
    
    assertEquals("2 4 6 8 8\n2 4 6 6 8\n2 4 4 6 8\n2 3 4 6 8\n", new Solution.InsertionSortPart1().solve(new Scanner(input)));
  }
}
