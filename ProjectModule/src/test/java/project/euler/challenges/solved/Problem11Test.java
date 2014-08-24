 
package project.euler.challenges.solved;

import junit.framework.TestCase;

 
public class Problem11Test extends TestCase {
  
  public Problem11Test(String testName) {
    super(testName);
  }
  
   

  public void testSomeMethod() {
    final  Problem11 instance = new Problem11();
    assertTrue(70600674 == instance.processGrid(instance.generateGrid(Problem11.str.split(" "))));
  }
}
