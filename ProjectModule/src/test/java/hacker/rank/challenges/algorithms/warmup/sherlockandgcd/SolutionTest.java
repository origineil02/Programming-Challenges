package hacker.rank.challenges.algorithms.warmup.sherlockandgcd;

import hacker.rank.challenges.algorithms.warmup.sherlockandgcd.Solution;
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

  @Test
  public void testCase0() {
    final String input = "10\n"
            + "52\n"
            + "35264 17632 17632 70528 35264 70528 17632 88160 35264 70528 70528 35264 17632 17632 17632 17632 17632 70528 35264 35264 17632 88160 52896 88160 70528 17632 70528 17632 52896 17632 17632 35264 88160 17632 70528 88160 17632 88160 52896 88160 70528 88160 70528 88160 88160 88160 35264 17632 17632 88160 35264 70528\n"
            + "60\n"
            + "5106 73623 20833 80256 83114 18694 55464 13975 30694 5735 2005 95231 61104 35301 49033 59523 5839 44215 65183 90295 14660 62782 47981 34999 86633 3205 89409 87661 53522 86434 76773 26186 44365 43601 10973 76810 1283 81629 44165 84818 67574 75769 60213 57427 21667 61632 52287 79494 5823 33242 38381 76655 79836 60280 98437 85051 5602 3893 81478 53284\n"
            + "74\n"
            + "69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932 69932\n"
            + "27\n"
            + "28587 85761 85761 85761 28587 85761 28587 85761 28587 57174 85761 85761 85761 28587 57174 85761 85761 85761 85761 85761 28587 85761 28587 57174 57174 28587 28587\n"
            + "14\n"
            + "66694 14259 1710 57758 10303 28775 10037 7706 88458 76927 73054 56600 92544 7414\n"
            + "98\n"
            + "85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645 85645\n"
            + "97\n"
            + "80390 40195 40195 40195 80390 80390 80390 80390 80390 40195 40195 40195 80390 80390 40195 40195 80390 80390 40195 40195 40195 40195 40195 80390 40195 40195 80390 40195 80390 40195 80390 40195 80390 40195 40195 40195 40195 80390 80390 40195 40195 40195 80390 40195 40195 80390 40195 40195 40195 80390 40195 80390 80390 80390 80390 80390 80390 40195 80390 80390 40195 80390 80390 80390 80390 40195 40195 80390 40195 40195 40195 40195 40195 40195 40195 40195 80390 40195 40195 40195 80390 80390 80390 80390 40195 80390 40195 40195 40195 40195 40195 80390 40195 80390 80390 80390 40195\n"
            + "6\n"
            + "76050 76050 76050 76050 76050 76050\n"
            + "55\n"
            + "81750 54500 54500 54500 27250 54500 54500 27250 54500 54500 27250 81750 81750 54500 81750 27250 27250 27250 81750 54500 54500 54500 27250 27250 81750 81750 54500 54500 81750 54500 54500 54500 27250 27250 27250 54500 54500 81750 81750 54500 54500 81750 54500 54500 27250 27250 54500 54500 27250 54500 54500 81750 27250 27250 54500\n"
            + "47\n"
            + "74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057 74057";

    final String output = "NO\n"
            + "YES\n"
            + "NO\n"
            + "NO\n"
            + "YES\n"
            + "NO\n"
            + "NO\n"
            + "NO\n"
            + "NO\n"
            + "NO";
    assertEquals(output, new Solution.SherlockAndGCD().solve(new Scanner(input)));
  }

  @Test
  public void testPrimes() {
    final String input = "1\n2\n3 5";
    assertEquals("YES", new Solution.SherlockAndGCD().solve(new Scanner(input)));
  }

}