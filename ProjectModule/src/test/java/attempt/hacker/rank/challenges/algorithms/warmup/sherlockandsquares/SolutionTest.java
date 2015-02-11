package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandsquares;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "2\n3 9\n17 24";
    
    assertEquals("2\n0", new Solution.SherlockAndSquares().solve(new Scanner(input)));
  }
  
  /*
  public void testConstraints(){
      new Solution.SherlockAndSquares().solve(new Scanner("1\n 1 "+Integer.MAX_VALUE));
  }
  */
}

