package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample1() {
    final String input = "4 5\n"
            + ".....\n"
            + ".x.x.\n"
            + ".....\n"
            + ".....";

    assertEquals("14", new Solution.MrKMarsh().solve(new Scanner(input)));
  }

  public void testSample2() {
    final String input = "2 2\n"
            + ".x\n"
            + "x.";

    assertEquals("impossible", new Solution.MrKMarsh().solve(new Scanner(input)));
  }

  public void testSample3() {
    final String input = "2 5\n"
            + ".....\n"
            + "xxxx.";

    assertEquals("impossible", new Solution.MrKMarsh().solve(new Scanner(input)));
  }
  
  public void testCustom() {
    final String input = "4 5\n"
            + ".x...\n"
            + "x.x.x\n"
            + "x.x..\n"
            + ".....";

    assertEquals("4", new Solution.MrKMarsh().solve(new Scanner(input)));
  }
  
  public void testCustom2() {
    final String input = "4 5\n"
            + ".x...\n"
            + "x.x..\n"
            + "x.x..\n"
            + "....x";

    assertEquals("6", new Solution.MrKMarsh().solve(new Scanner(input)));
  }
}
