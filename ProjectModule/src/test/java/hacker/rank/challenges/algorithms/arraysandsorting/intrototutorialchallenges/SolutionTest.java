package hacker.rank.challenges.algorithms.arraysandsorting.intrototutorialchallenges;

import hacker.rank.challenges.algorithms.arraysandsorting.intrototutorialchallenges.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "4\n6\n1 4 5 7 9 12";
    
    assertEquals("1", new Solution.IntroToTutorialChallenges().solve(new Scanner(input)));
  }
}
