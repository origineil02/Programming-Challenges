package hacker.rank.challenges.algorithms.sorting.makeitanagram;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{
  
  public void testSample() {
    assertEquals("4", new Solution.MakeItAnagram().solve(new Scanner("abc\ncde")));
  }
}
