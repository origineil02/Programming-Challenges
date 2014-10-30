package hacker.rank.challenges.misc.regex.alienusername;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {
    final String input = "3\n"
            + "_0898989811abced_\n"
            + "_abce\n"
            + "_09090909abcD0";

    assertEquals("VALID\nINVALID\nINVALID", new Solution.AlienUsername().solve(new Scanner(input)));
  }
  
  @Test
  public void testCustomInput() {
    final String[] userNames = (".12a_\n" 
                              + ".a_"
                              + ".1a_"
                              + ".1"
                              + "_1_").split("\n");

    final String[] expected = ("VALID\nINVALID\nVALID\nVALID\nVALID").split("\n");
    for(int i = 0; i < userNames.length; ++i){
        assertEquals(expected[i], new Solution.AlienUsername().solve(new Scanner("1\n"+userNames[i])));
    }
  }
}
