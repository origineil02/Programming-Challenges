package hacker.rank.challenges.algorithms.numbertheory.restaurant;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
  
  public void testSample() {
     assertEquals("1\n6", new Solution.Restaurant().solve(new Scanner("2\n2 2\n6 9")));
  }
}

