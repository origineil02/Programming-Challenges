package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandsquares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{

  public void testSample() {

    final String input = "2\n3 9\n17 24";
    
    assertEquals("2\n0", new Solution.SherlockAndSquares().solve(new Scanner(input)));
  }
  
  
  public void testConstraints(){
    assertEquals("1",  new Solution.SherlockAndSquares().solve(new Scanner("1\n 1 1")));
  }
  
  public void testBruteForce(){
    final List<Long> x = new ArrayList<>();
    int max = 1000000;
    for(long i = 1; i <= max; ++i){
      if(i*i <= max){
        x.add(i*i);
      }
    }
    System.out.println(x.size());
    
    for (Long y : x) {
      System.out.println(y);
    }
  }
}

