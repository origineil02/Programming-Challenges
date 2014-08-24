package hacker.rank.challenges.algorithms.warmup.gameofthrones;

import hacker.rank.challenges.algorithms.warmup.gameofthrones.Solution;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample1() {

    final String input = "aaabbbb";
    Assert.assertEquals("YES", new Solution.GameOfThrones().solve(new Scanner(input)));
  }

  @Test
  public void testSample2() {

    final String input = "cdefghmnopqrstuvw";
    Assert.assertEquals("NO", new Solution.GameOfThrones().solve(new Scanner(input)));
  }

  @Test
  public void testSample3() {

    final String input = "cdcdcdcdeeeef";
    Assert.assertEquals("YES", new Solution.GameOfThrones().solve(new Scanner(input)));
  }
}
