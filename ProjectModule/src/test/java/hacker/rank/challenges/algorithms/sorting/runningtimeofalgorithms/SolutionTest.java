package hacker.rank.challenges.algorithms.sorting.runningtimeofalgorithms;

import java.util.Scanner;
import junit.framework.TestCase;
public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "5\n2 1 3 1 2";
    
    assertEquals("4", new Solution.RunningTimeOfAlgorithms().solve(new Scanner(input)));
  }
}
