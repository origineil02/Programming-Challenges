package hacker.rank.challenges.algorithms.combinatronics.handshake;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {

    final String input = "2\n1\n2";
    assertEquals("0\n1", new Solution.Handshake().solve(new Scanner(input)));
  }
  
  public void testSample2() {

    final String input = "1\n2";
    assertEquals("1", new Solution.Handshake().solve(new Scanner(input)));
  }
}
