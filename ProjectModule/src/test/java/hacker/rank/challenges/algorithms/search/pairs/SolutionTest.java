package hacker.rank.challenges.algorithms.search.pairs;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase{
  
  public void testSample() {

    final String input = "5 2\n1 5 3 4 2";

    assertEquals("3", new Solution.Pairs().solve(new Scanner(input)));
  }
  
  public void testOtherSample() {

    final String input = "10 1\n363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793";

    assertEquals("0", new Solution.Pairs().solve(new Scanner(input)));
  }
}
