/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker.rank.challenges.misc.regex.splitthephonenumbers;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSomeMethod() {
    final String input = "2\n"
            + "1 877 2638277\n"
            + "91-011-23413627";
    final String output = "CountryCode=1,LocalAreaCode=877,Number=2638277\n"
            + "CountryCode=91,LocalAreaCode=011,Number=23413627\n";

    assertEquals(output, new Solution.SplitThePhoneNumbers().solve(new Scanner(input)));
  }

}
