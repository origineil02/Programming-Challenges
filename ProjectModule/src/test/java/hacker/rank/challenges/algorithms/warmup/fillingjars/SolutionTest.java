package hacker.rank.challenges.algorithms.warmup.fillingjars;

import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "5 3\n"
            + "1 2 100\n"
            + "2 5 100\n"
            + "3 4 100";
    
    Assert.assertEquals("160", new Solution.FillingJars().solve(new Scanner(input)));
  }
}
