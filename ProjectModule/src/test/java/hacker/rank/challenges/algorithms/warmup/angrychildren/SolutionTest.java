package hacker.rank.challenges.algorithms.warmup.angrychildren;

import hacker.rank.challenges.algorithms.warmup.angrychildren.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample1() {

    final String input = "7\n"
            + "3\n"
            + "10\n"
            + "100\n"
            + "300\n"
            + "200\n"
            + "1000\n"
            + "20\n"
            + "30";

    assertEquals("20", new Solution.AngryChildren().solve(new Scanner(input)));
  }

  @Test
  public void testSample2() {
    final String input = "10\n"
            + "4\n"
            + "1\n"
            + "2\n"
            + "3\n"
            + "4\n"
            + "10\n"
            + "20\n"
            + "30\n"
            + "40\n"
            + "100\n"
            + "200";

    assertEquals("3", new Solution.AngryChildren().solve(new Scanner(input)));
  }
  
  @Test
  public void testDuplicates1() {
    final String input = "4\n"
            + "2\n"
            + "4\n"
            + "4\n"
            + "3\n"
            + "2";

    assertEquals("1", new Solution.AngryChildren().solve(new Scanner(input)));
  }
  
    @Test
  public void testDuplicates2() {
    final String input = "4\n"
            + "2\n"
            + "4\n"
            + "6\n"
            + "4\n"
            + "5";

    assertEquals("0", new Solution.AngryChildren().solve(new Scanner(input)));
  }
  
      @Test
  public void exampleFromDiscussion() {
    final String input = "50 8 6327 571 6599 479 7897 9322 4518 571 6677 7432 815 6920 4329 4104 7775 5708 7991 5802 8619 6053 7539 7454 9000 3267 6343 7165 4095 439 5621 4095 153 1948 1018 6752 8779 5267 2426 9649 2190 9103 7081 3006 2376 7762 3462 151 3471 1453 2305 8442";
    assertEquals("816", new Solution.AngryChildren().solve(new Scanner(input)));
  }
}
