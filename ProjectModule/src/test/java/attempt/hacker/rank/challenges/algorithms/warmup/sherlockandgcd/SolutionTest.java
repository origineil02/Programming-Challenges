package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandgcd;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "2\n"
            + "3\n"
            + "1 2 3\n"
            + "2\n"
            + "2 4";

    final String output = "YES\nNO";
    assertEquals(output, new Solution.SherlockAndGCD().solve(new Scanner(input)));
  }

}
