package hacker.rank.challenges.misc.regex.hackerranktweets;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "4\n"
            + "I love #hackerrank\n"
            + "I just scored 27 points in the Picking Cards challenge on #HackerRank\n"
            + "I just signed up for summer cup @hackerrank\n"
            + "interesting talk by hari, co-founder of hackerrank";

    assertEquals("4", new Solution.HackerRankTweets().solve(new Scanner(input)));
  }
}
