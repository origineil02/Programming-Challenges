package hacker.rank.challenges.algorithms.probability.bdaygift;

import java.util.Scanner;
import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{
  
  public void testSample1() {
    Assert.assertEquals("2.0", new Solution.BirthdayGift().solve(new Scanner("3\n1\n1\n2")));
  }
  
  public void testSample2() {
    Assert.assertEquals("3.5", new Solution.BirthdayGift().solve(new Scanner("4\n1\n2\n2\n2")));
  }
}
