package hacker.rank.challenges.misc.regex.alienusername;

import java.util.HashMap;
import java.util.Map;
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
    final Map<String, String> testCases = new HashMap<>();
    testCases.put(".12a_", "VALID");
    testCases.put("_12a_", "VALID");
    testCases.put(".12a", "VALID");
    testCases.put("_12a", "VALID");
    testCases.put(".1a_", "VALID");
    testCases.put(".1Z_", "VALID");
    testCases.put(".1Z", "VALID");
    testCases.put("_1Z_", "VALID");
    testCases.put("_1Z", "VALID");
    testCases.put(".1", "VALID");
    testCases.put("_1", "VALID");
    testCases.put(".1_", "VALID");
    testCases.put("_1_", "VALID");
    
    testCases.put("1a_", "INVALID");
    testCases.put("1Z_", "INVALID");
    testCases.put("1Z", "INVALID");
    testCases.put("1a", "INVALID");
    testCases.put("a", "INVALID");
    testCases.put(".a", "INVALID");
    testCases.put("_a", "INVALID");
    testCases.put("_a_", "INVALID");
    testCases.put(".a_", "INVALID");
   
    for (Map.Entry<String, String> entry : testCases.entrySet()) {
        assertEquals(entry.getKey(), entry.getValue(), new Solution.AlienUsername().solve(new Scanner("1\n"+entry.getKey())));
    }
  }
}
