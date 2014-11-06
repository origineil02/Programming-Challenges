package project.euler.challenges.solved;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem112Test {
  
  @Test
  public void testProblemStatement() {
    assertEquals("21780", new Problem112.BouncyNumbers().solve(90));
  }
  
}
