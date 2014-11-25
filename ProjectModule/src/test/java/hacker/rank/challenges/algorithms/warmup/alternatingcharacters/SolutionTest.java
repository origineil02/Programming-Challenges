package hacker.rank.challenges.algorithms.warmup.alternatingcharacters;

import java.util.Scanner;
import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "5\n"
            + "AAAA\n"
            + "BBBBB\n"
            + "ABABABAB\n"
            + "BABABA\n"
            + "AAABBB";
    Assert.assertEquals("3\n4\n0\n0\n4", new Solution.AlternatingCharacters().solve(new Scanner(input)));
  }

    public void test() {
    final String input = "1\n"
            + "AAABBB";
    Assert.assertEquals("4", new Solution.AlternatingCharacters().solve(new Scanner(input)));
  }
}
