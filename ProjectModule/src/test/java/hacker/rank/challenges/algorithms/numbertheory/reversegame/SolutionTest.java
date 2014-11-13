package hacker.rank.challenges.algorithms.numbertheory.reversegame;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{
  
   public void testSample() {

    assertEquals("2\n4", new Solution.ReverseGame().solve(new Scanner("2\n3 1\n5 2")));
  }
}
