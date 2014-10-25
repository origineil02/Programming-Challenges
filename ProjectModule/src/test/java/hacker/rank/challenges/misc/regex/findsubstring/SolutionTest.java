package hacker.rank.challenges.misc.regex.findsubstring;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "1\n"
            + "existing pessimist optimist this is\n"
            + "1\n"
            + "is";
    
    assertEquals("3\n", new Solution.FindSubstring().solve(new Scanner(input)));
  }
}
