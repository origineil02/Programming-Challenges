package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandsquares;

import attempt.hacker.rank.algorithms.warmup.sherlockandsquares.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "2\n3 9\n17 24";
    
    assertEquals("2\n0\n", new Solution.SherlockAndSquares().solve(new Scanner(input)));
  }
  
  @Test
  public void testConstraints(){
      new Solution.SherlockAndSquares().solve(new Scanner("1\n 1 "+Integer.MAX_VALUE));
  }
}

