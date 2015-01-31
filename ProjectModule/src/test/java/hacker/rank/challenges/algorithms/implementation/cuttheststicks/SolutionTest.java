package hacker.rank.challenges.algorithms.implementation.cuttheststicks;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample1() {

    final String input = "6\n5 4 4 2 2 8";
    
    assertEquals("6\n4\n2\n1\n", new Solution.CutTheSticks().solve(new Scanner(input)));
  }
  
  public void testSample2() {

    final String input = "8\n1 2 3 4 3 3 2 1";
    
    assertEquals("8\n6\n4\n1\n", new Solution.CutTheSticks().solve(new Scanner(input)));
  }
}
