package hacker.rank.challenges.algorithms.search.encryption;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testProblemStatement() {
    final String input = "if man was meant to stay on the ground god would have given us roots";
    
    assertEquals("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau", new Solution.Encryption().solve(new Scanner(input)));
  }
  
  public void testSample() {
    final Map<String, String> samples = new HashMap<>();
    samples.put("haveaniceday", "hae and via ecy");
    samples.put("feedthedog", "fto ehg ee dd");
    samples.put("chillout", "clu hlt io");
    
    for (Map.Entry<String, String> entry : samples.entrySet()) {
       assertEquals(entry.getValue(), new Solution.Encryption().solve(new Scanner(entry.getKey())));
    }
  }
}
