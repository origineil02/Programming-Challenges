package hacker.rank.challenges.algorithms.warmup.halloweenparty;

import hacker.rank.challenges.algorithms.warmup.halloweenparty.Solution;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "4\n5\n6\n7\n8";
    Assert.assertEquals("6\n9\n12\n16\n", new Solution.HalloweenParty().solve(new Scanner(input)));
  }

  @Test
  public void testUpperConstraint() {
    final String input = "1 " + String.valueOf((int)Math.pow(10, 7));
    System.out.println(input);
    
    String actualOutput = new Solution.HalloweenParty().solve(new Scanner(input));
    actualOutput = actualOutput.replace("\n", "");
    
    Assert.assertTrue(Integer.MAX_VALUE < Long.parseLong(actualOutput));
  }
}
