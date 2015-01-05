package hacker.rank.challenges.algorithms.search.missingnumbers;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "10\n203 204 205 206 207 208 203 204 205 206\n"
            + "13\n203 204 204 205 206 207 205 208 203 206 205 206 204";

    assertEquals("204 205 206", new Solution.MissingNumbers().solve(new Scanner(input)));
  }

}
