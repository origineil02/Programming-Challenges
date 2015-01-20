package hacker.rank.challenges.algorithms.warmup.solvemesecond;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest extends TestCase {
  
  public void testSample() {
    final String input = "2\n2 3\n3 7";

    assertEquals("5\n10", new Solution.SolveMeSecond().solve(new Scanner(input)));
  }
  
}
