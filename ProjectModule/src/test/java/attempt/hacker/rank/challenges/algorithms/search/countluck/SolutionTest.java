package attempt.hacker.rank.challenges.algorithms.search.countluck;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample_Case1(){
  final String input = "1\n"
            + "2 3\n"
            + "*.M\n"
            + ".X.\n"
            + "1";
   assertEquals("Impressed", new Solution.CountLuck().solve(new Scanner(input)));
  }
  
  public void testSample_Case2(){
  final String input = "1\n"
            + "4 11\n"
            + ".X.X......X\n"
            + ".X*.X.XXX.X\n"
            + ".XX.X.XM...\n"
            + "......XXXX.\n"
            + "3";
   assertEquals("Impressed", new Solution.CountLuck().solve(new Scanner(input)));
  }
  public void testSample() {

    final String input = "1\n" 
            + "4 11\n"
            + ".X.X......X\n"
            + ".X*.X.XXX.X\n"
            + ".XX.X.XM...\n"
            + "......XXXX.\n"
            + "4";

    assertEquals("Oops!", new Solution.CountLuck().solve(new Scanner(input)));
  }
}
