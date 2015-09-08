package hacker.rank.challenges.algorithms.warmup.plusminus;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testProblemStatement() {

    final String input = "6\n-4 3 -9 0 4 1  ";

    assertEquals("0.500\n0.333\n0.167", new Solution.PlusMinus().solve(new Scanner(input)));
  }
  
  public void testNonExistingType() {

    final String input = "6\n4 3 9 0 4 1  ";

    assertEquals("0.833\n0.000\n0.167", new Solution.PlusMinus().solve(new Scanner(input)));
  }
}
