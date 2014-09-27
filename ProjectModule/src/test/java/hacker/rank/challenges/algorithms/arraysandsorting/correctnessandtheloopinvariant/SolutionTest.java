package hacker.rank.challenges.algorithms.arraysandsorting.correctnessandtheloopinvariant;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
    public void testSample() {
    assertEquals("1 2 3 4 5 6", new Solution.CorrectnessAndLoopInvariant().solve(new Scanner("6\n1 4 3 5 6 2")));
  }
    
  @Test
  public void testSampleReversed() {
    assertEquals("1 2 3 4 5 6", new Solution.CorrectnessAndLoopInvariant().solve(new Scanner("6\n6 5 4 3 2 1")));
  }
}
