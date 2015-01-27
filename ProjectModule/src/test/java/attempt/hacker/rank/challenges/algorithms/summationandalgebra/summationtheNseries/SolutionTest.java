package attempt.hacker.rank.challenges.algorithms.summationandalgebra.summationtheNseries;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{
  
  public void testSample() {
    assertEquals("4\n1", new Solution.SummationNSeries().solve(new Scanner("2\n2\n1")));
  }
  
  public void test() {
     StringBuilder sb = new StringBuilder();
    
    for (int i = 1; i < 10000; i++) {
      String result = new Solution.SummationNSeries().solve(new Scanner("1\n" + i));
      sb.append(i).append(" : ").append(result).append("\n");
     
      if(i %1000 == 0){
        System.out.println(sb.toString());
      sb = new StringBuilder();
      }
    }
    System.out.println(sb.toString());
  }
  
}
