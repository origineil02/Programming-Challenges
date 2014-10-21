package hacker.rank.challenges.misc.regex.spellingstyle;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "2\n"
            + "hackerrank has such a good ui that it takes no time to familiarise its environment\n"
            + "to familiarize oneself with ui of hackerrank is easy\n"
            + "1\n"
            + "familiarize";

    assertEquals("2\n", new Solution.SpellingStyle().solve(new Scanner(input)));
  }
}
