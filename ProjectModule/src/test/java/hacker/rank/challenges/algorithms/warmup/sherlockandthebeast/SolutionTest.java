package hacker.rank.challenges.algorithms.warmup.sherlockandthebeast;

import hacker.rank.challenges.algorithms.warmup.sherlockandthebeast.Solution;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
    Assert.assertEquals("-1\n555\n33333\n55555533333\n", new Solution.SherlockAndTheBeast().solve(new Scanner("4\n1\n3\n5\n11")));
  }
  
  @Test
  public void test_6() {
    Assert.assertEquals("555555\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n6")));
  }
  
  @Test
  public void test_8() {
    Assert.assertEquals("55533333\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n8")));
  }
  
  @Test
  public void test_10() {
    Assert.assertEquals("3333333333\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n10")));
  }
  
  @Test
  public void test_11() {
    Assert.assertEquals("55555533333\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n11")));
  }
  
  @Test
  public void test_12() {
    Assert.assertEquals("555555555555\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n12")));
  }
  
  @Test
  public void test_25() {
    Assert.assertEquals("5555555555555553333333333\n", new Solution.SherlockAndTheBeast().solve(new Scanner("1\n25")));
  }
}
