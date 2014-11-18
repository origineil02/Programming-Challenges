package hacker.rank.challenges.misc.regex.sayinghi;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "5\n"
            + "Hi Alex how are you doing\n"
            + "hI dave how are you doing\n"
            + "Good by Alex\n"
            + "hidden agenda\n"
            + "Alex greeted Martha by saying Hi Martha";

    assertEquals("Hi Alex how are you doing\n", new Solution.SayingHi().solve(new Scanner(input)));
  }
}
