package hacker.rank.challenges.algorithms.warmup.isfibo;

import hacker.rank.challenges.algorithms.warmup.isfibo.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "3\n5\n7\n8\n";
    
    assertEquals("IsFibo\nIsNotFibo\nIsFibo\n", new Solution.IsFibo().solve(new Scanner(input)));
  }
}
