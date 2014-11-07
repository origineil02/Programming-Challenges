package hacker.rank.challenges.algorithms.warmup.solvemefirst;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
    assertEquals("5", new Solution.SolveMeFirst().solve(new Scanner("2\n3\n4")));
  }
  
  @Test
  public void testConstraints(){
    for(int i = 1; i <=1000; ++i){
       assertEquals(String.valueOf(i+1), new Solution.SolveMeFirst().solve(new Scanner(String.valueOf(i) + "\n1")));
    }
  }
}
