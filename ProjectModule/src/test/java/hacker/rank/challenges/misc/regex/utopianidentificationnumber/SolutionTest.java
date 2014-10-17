package hacker.rank.challenges.misc.regex.utopianidentificationnumber;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "2\n"
            + "abc012333ABCDEEEE\n"
            + "0123AB";

    assertEquals("VALID\nINVALID\n", new Solution.UtopianIdNumber().solve(new Scanner(input)));
  }
}
