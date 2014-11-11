package hacker.rank.challenges.algorithms.numbertheory.restaurant;

import java.util.Scanner;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    assertEquals("1\n6", new Solution.Restaurant().solve(new Scanner("2\n2 2\n6 9")));
  }

  public void testCase0() {
    final String input = "11\n"
            + "38 751\n"
            + "344 734\n"
            + "165 635\n"
            + "297 667\n"
            + "917 264\n"
            + "544 642\n"
            + "254 914\n"
            + "612 50\n"
            + "94 707\n"
            + "564 417\n"
            + "145 246";

    final String output = "28538\n"
            + "63124\n"
            + "4191\n"
            + "198099\n"
            + "242088\n"
            + "87312\n"
            + "58039\n"
            + "7650\n"
            + "66458\n"
            + "26132\n"
            + "35670";

    assertEquals(output, new Solution.Restaurant().solve(new Scanner(input)));
  }

  public void testCase1() {
    final String input = "25\n"
            + "309 528\n"
            + "577 101\n"
            + "371 314\n"
            + "207 346\n"
            + "284 715\n"
            + "178 791\n"
            + "725 295\n"
            + "796 916\n"
            + "667 231\n"
            + "282 302\n"
            + "984 882\n"
            + "718 844\n"
            + "372 749\n"
            + "735 419\n"
            + "979 914\n"
            + "444 837\n"
            + "715 67\n"
            + "381 22\n"
            + "367 87\n"
            + "801 365\n"
            + "157 429\n"
            + "723 756\n"
            + "673 882\n"
            + "890 520\n"
            + "599 342";

    final String output = "18128\n"
            + "58277\n"
            + "116494\n"
            + "71622\n"
            + "203060\n"
            + "140798\n"
            + "8555\n"
            + "45571\n"
            + "154077\n"
            + "21291\n"
            + "24108\n"
            + "151498\n"
            + "278628\n"
            + "307965\n"
            + "894806\n"
            + "41292\n"
            + "47905\n"
            + "8382\n"
            + "31929\n"
            + "292365\n"
            + "67353\n"
            + "60732\n"
            + "593586\n"
            + "4628\n"
            + "204858";
    assertEquals(output, new Solution.Restaurant().solve(new Scanner(input)));
  }
}
