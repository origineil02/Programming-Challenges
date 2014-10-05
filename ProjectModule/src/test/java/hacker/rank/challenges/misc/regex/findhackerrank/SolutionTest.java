package hacker.rank.challenges.misc.regex.findhackerrank;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "4\n"
            + "i love hackerrank\n"
            + "hackerrank is an awesome place for programmers\n"
            + "hackerrank\n"
            + "i think hackerrank is a great place to hangout";

    assertEquals("2\n1\n0\n-1\n", new Solution.FindHackerRank().solve(new Scanner(input)));
  }

}
