package hacker.rank.challenges.algorithms.search.lonelyinteger;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample1() {
    assertEquals("1", new Solution.LonelyInteger().solve(new Scanner("1\n1")));
  }

  @Test
  public void testSample2() {
    assertEquals("2", new Solution.LonelyInteger().solve(new Scanner("3\n1 1 2")));
  }

  @Test
  public void testSample3() {
    assertEquals("2", new Solution.LonelyInteger().solve(new Scanner("5\n0 0 1 2 1")));
  }
  
  @Test
  public void testSample4() {
    assertEquals("95", new Solution.LonelyInteger().solve(new Scanner("5\n4 9 95 93 57 4 57 93 9")));
  }

  @Test
  public void testCaseCustom() {
    assertEquals("2", new Solution.LonelyInteger().solve(new Scanner("5\n0 0 1 2 1 3 3")));
  }
}
