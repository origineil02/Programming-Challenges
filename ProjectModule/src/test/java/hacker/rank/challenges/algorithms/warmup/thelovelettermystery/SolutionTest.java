package hacker.rank.challenges.algorithms.warmup.thelovelettermystery;

import hacker.rank.challenges.algorithms.warmup.thelovelettermystery.Solution;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "abc\n"
            + "abcba\n"
            + "abcd";
    
    Assert.assertEquals("2\n0\n4\n", new Solution.TheLoveLetterMyster().solve(new Scanner(input)));
  }

    @Test
  public void testSampleReversed() {
    final String input = "3\n"
            + "cba\n"
            + "abcba\n"
            + "dcba";
    
    Assert.assertEquals("2\n0\n4\n", new Solution.TheLoveLetterMyster().solve(new Scanner(input)));
  }
}
