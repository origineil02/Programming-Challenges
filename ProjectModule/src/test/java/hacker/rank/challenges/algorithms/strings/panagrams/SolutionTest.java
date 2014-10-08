package hacker.rank.challenges.algorithms.strings.panagrams;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample1() {
    assertEquals("pangram", new Solution.Pangrams().solve(new Scanner("We promptly judged antique ivory buckles for the next prize")));
  }

  @Test
  public void testSample2() {
    assertEquals("not pangram", new Solution.Pangrams().solve(new Scanner("We promptly judged antique ivory buckles for the prize")));
  }
}
