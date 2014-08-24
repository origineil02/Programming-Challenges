package hacker.rank.challenges.algorithms.warmup.manasaandstones;

import hacker.rank.challenges.algorithms.warmup.manasaandstones.Solution.MasanaAndStones;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "2\n"
            + "3 \n"
            + "1\n"
            + "2\n"
            + "4\n"
            + "10\n"
            + "100";

    final String output = "2 3 4\n"
            + "30 120 210 300\n";

    assertEquals(output, new MasanaAndStones().solve(new Scanner(input)));
  } 
}
