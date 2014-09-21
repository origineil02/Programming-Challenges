package hacker.rank.challenges.algorithms.arraysandsorting.makitanagram;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
    public void testSample() {
      assertEquals("4", new Solution.MakeItAnagram().solve(new Scanner("abc\ncde")));
  }
}
