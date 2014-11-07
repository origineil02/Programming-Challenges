package hacker.rank.challenges.algorithms.warmup.utopiantree;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSomeMethod() {
    assertEquals("6\n7\n", new Solution.UtopianTree().solve(new Scanner("2\n3\n4")));
  }
  
  @Test
  public void testConstraint_Lower() {
    assertEquals("1\n", new Solution.UtopianTree().solve(new Scanner("1\n0")));
  }
  
  @Test
  public void testConstraint_Upper() {
    assertEquals("2147483647\n", new Solution.UtopianTree().solve(new Scanner("1\n60")));
  }
}
