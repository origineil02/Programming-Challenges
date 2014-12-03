package hacker.rank.challenges.algorithms.arraysandsorting.findingthemean;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "7\n0 1 2 4 6 5 3";
    
    assertEquals("3", new Solution.FindingTheMean().solve(new Scanner(input)));
  }
}
