package hacker.rank.challenges.algorithms.warmup.finddigits;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
     assertEquals("2\n", new Solution.FindDigits().solve(new Scanner("1\n12\n")));
  }
  
  @Test
  public void testZero() {
     assertEquals("2\n", new Solution.FindDigits().solve(new Scanner("1\n120\n")));
  }
 
  @Test
  public void testMultiline() {
     assertEquals("2\n2\n", new Solution.FindDigits().solve(new Scanner("2\n120\n123\n")));
  }
  
  @Test
  public void testMultiDigit() {
     assertEquals("3\n", new Solution.FindDigits().solve(new Scanner("1\n122\n")));
  }
    
  @Test
  public void testConstraint() {
     Long upperConstraint = (long)Math.pow(10, 10);
     assertEquals("10\n", new Solution.FindDigits().solve(new Scanner("1\n"+ (upperConstraint - 1) +"\n")));
  }
}
