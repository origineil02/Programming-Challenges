package hacker.rank.challenges.algorithms.warmup.chocolatefeast;

import hacker.rank.challenges.algorithms.warmup.chocolatefeast.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "3\n"
            + "10 2 5\n"
            + "12 4 4\n"
            + "6 2 2";
    
    assertEquals("6\n3\n5\n", new Solution.ChocolateFeast().solve(new Scanner(input)));
  }
  
  @Test
  public void test(){
     assertEquals("7\n", new Solution.ChocolateFeast().solve(new Scanner("1\n8 2 2")));
  }
}
