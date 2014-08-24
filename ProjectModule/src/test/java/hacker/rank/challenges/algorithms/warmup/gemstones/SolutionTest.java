package hacker.rank.challenges.algorithms.warmup.gemstones;

import hacker.rank.challenges.algorithms.warmup.gemstones.Solution.GemStones;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "abcdde\n"
            + "baccd\n"
            + "eeabg";
    Assert.assertEquals("2", new GemStones().solve(new Scanner(input)));
  }

   @Test
  public void testNothing() {
    final String input = "3\n"
            + "a\n"
            + "b\n"
            + "c";
    Assert.assertEquals("0", new GemStones().solve(new Scanner(input)));
  }
}
