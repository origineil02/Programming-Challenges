package hacker.rank.challenges.algorithms.sorting.intrototutorialchallenges;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {

    final String input = "4\n6\n1 4 5 7 9 12";
    assertEquals("1", new Solution.IntroToTutorialChallenges().solve(new Scanner(input)));
  }
}
