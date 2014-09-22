package hacker.rank.challenges.algorithms.arraysandsorting.cavitymap;

import hacker.rank.challenges.algorithms.arraysandsorting.cavitymap.Solution.CavityMap;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "4\n"
            + "1112\n"
            + "1912\n"
            + "1892\n"
            + "1234";

    final String output = "1112\n1X12\n18X2\n1234\n";
    assertEquals(output, new CavityMap().solve(new Scanner(input)));
  }

}
