package hacker.rank.challenges.algorithms.warmup.maximizingxor;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
    assertEquals("15", new Solution.MaximizingXOR().solve(new Scanner("10\n5\n")));
  }
  
   @Test
  public void testSampleReversed() {
    assertEquals("15", new Solution.MaximizingXOR().solve(new Scanner("5\n10\n")));
  }
}
