package hacker.rank.challenges.algorithms.arraysandsorting.quicksort.partition;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
   assertEquals("3 2 4 5 7", new Solution.Partition().solve(new Scanner("5\n4 5 3 7 2")));
  }
  
  @Test
  public void testSample2(){
    
    assertEquals("2 10 3 7 9 4 6 12 8", new Solution.Partition().solve(new Scanner("9\n2 10 3 7 9 4 6 12 8" )));
  }
}
