package hacker.rank.challenges.misc.validpanformat;

import hacker.rank.challenges.misc.regex.validpanformat.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "ABCDS1234Y\n"
            + "ABAB12345Y\n"
            + "avCDS1234Y";

    assertEquals("YES\nNO\nNO\n", new Solution.ValidPanFormat().solve(new Scanner(input)));
  }
}
