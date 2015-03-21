package hacker.rank.challenges.algorithms.sorting.insertionsort.part2;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {

    final String input = "6\n1 4 3 5 6 2";
    
    assertEquals("1 4 3 5 6 2\n1 3 4 5 6 2\n1 3 4 5 6 2\n1 3 4 5 6 2\n1 2 3 4 5 6\n", new Solution.InsertionSortPart2().solve(new Scanner(input)));
  }
}
