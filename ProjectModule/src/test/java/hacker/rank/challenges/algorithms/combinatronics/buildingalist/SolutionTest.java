package hacker.rank.challenges.algorithms.combinatronics.buildingalist;

import hacker.rank.challenges.algorithms.combinatronics.buildingalist.Solution;
import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testProblemStatement(){
    final String input = "1\n3\nabc";
    assertEquals("a\nab\nabc\nac\nb\nbc\nc", new Solution.BuildingAList().solve(new Scanner(input)));
  }
  
  public void testProblemStatementReversed(){
    final String input = "1\n3\ncba";
    assertEquals("a\nab\nabc\nac\nb\nbc\nc", new Solution.BuildingAList().solve(new Scanner(input)));
  }
   
  public void testSample() {
    final String input = "2\n2\nab\n3\nxyz";
    assertEquals("a\nab\nb\nx\nxy\nxyz\nxz\ny\nyz\nz", new Solution.BuildingAList().solve(new Scanner(input)));
  }
}
