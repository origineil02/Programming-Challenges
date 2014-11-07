package hacker.rank.challenges.algorithms.arraysandsorting.countingsort.part3;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "10\n"
            + "4 that\n"
            + "3 be\n"
            + "0 to\n"
            + "1 be\n"
            + "5 question\n"
            + "1 or\n"
            + "2 not\n"
            + "4 is\n"
            + "2 to\n"
            + "4 the";

    final String output = "1 3 5 6 9 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10";
    assertEquals(output, new hacker.rank.challenges.algorithms.arraysandsorting.countingsort.part3.Solution.CountingSortPart3().solve(new Scanner(input)));
  }
}
