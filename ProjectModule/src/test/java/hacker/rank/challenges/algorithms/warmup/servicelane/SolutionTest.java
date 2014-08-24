package hacker.rank.challenges.algorithms.warmup.servicelane;

import hacker.rank.challenges.algorithms.warmup.servicelane.Solution;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    String input = "8 5\n"
            + "2 3 1 2 3 2 3 3\n"
            + "0 3\n"
            + "4 6\n"
            + "6 7\n"
            + "3 5\n"
            + "0 7";

    final String expected = "1\n"
            + "2\n"
            + "3\n"
            + "2\n"
            + "1\n";
    
    Assert.assertEquals(expected, new Solution.ServiceLane().solve(new Scanner(input)));
  }
}
