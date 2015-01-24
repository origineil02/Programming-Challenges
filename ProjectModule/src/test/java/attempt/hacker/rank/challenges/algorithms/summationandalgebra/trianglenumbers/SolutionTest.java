package attempt.hacker.rank.challenges.algorithms.summationandalgebra.trianglenumbers;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
  
  public void testSample() {
    System.out.println(Integer.MAX_VALUE);
    assertEquals("2\n3", new Solution.TriangleNumbers().solve(new Scanner("2\n3\n4")));
  }
  
  public void testProblemStatement() {
    assertEquals("-1\n-1", new Solution.TriangleNumbers().solve(new Scanner("2\n1\n2")));
    
    for(int i = 5; i < 10; ++i){
      System.out.println(new Solution.TriangleNumbers().solve(new Scanner("1\n"+i)));
    }
    
  }
  
  
}
