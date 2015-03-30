package hacker.rank.challenges.algorithms.combinatronics.minimumdraws;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "2\n1\n2";
    
    assertEquals("2\n3", new Solution.MinimumDraws().solve(new Scanner(input)));
  }
}

