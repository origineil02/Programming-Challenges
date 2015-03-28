package hacker.rank.challenges.algorithms.sorting.sherlockandpairs;
import java.io.File;
import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    assertEquals("0\n2\n", new Solution.SherlockAndPairs().solve(new Scanner("2\n3\n3 2 1\n3\n1 1 2")));
  }

  public void testCase2() throws Exception {

    final File input = new File("SherlockAndPairsTestCase2.txt");
    assertEquals("0\n"
            + "9948\n"
            + "9938\n"
            + "9999900000\n"
            + "0\n"
            + "9999900000\n"
            + "0\n"
            + "9980\n"
            + "9999900000\n"
            + "9999900000\n", new Solution.SherlockAndPairs().solve(new Scanner(input)));
  }
}
