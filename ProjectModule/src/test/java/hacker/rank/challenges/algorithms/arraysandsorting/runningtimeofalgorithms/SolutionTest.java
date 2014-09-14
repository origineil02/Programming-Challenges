package hacker.rank.challenges.algorithms.arraysandsorting.runningtimeofalgorithms;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "5\n2 1 3 1 2";
    
    assertEquals("4", new Solution.RunningTimeOfAlgorithms().solve(new Scanner(input)));
  }
}
