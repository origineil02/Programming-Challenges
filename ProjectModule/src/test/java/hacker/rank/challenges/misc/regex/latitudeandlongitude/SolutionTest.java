package hacker.rank.challenges.misc.regex.latitudeandlongitude;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void testSample1() {

    final String[] testCases = ("(75, 180)\n"
            + "(90, 180)\n"
            + "(+90, +180)\n"
            + "(+90.0, -147.45)\n"
            + "(77.11112223331, 149.99999999)\n"
            + "(-90.00000, -180.0000)\n"
            + "(75, 280)\n"
            + "(+190.0, -147.45)\n"
            + "(77.11112223331, 249.99999999)\n"
            + "(+90, +180.2)\n"
            + "(90., 180.)\n"
            + "(-090.00000, -180.0000)").split("\n");

    final String[] output = ("Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid").split("\n");

    for (int i = 0; i < testCases.length; ++i) {
      assertEquals(testCases[i], output[i] + "\n", new Solution.LatitudeAndLongitude().solve(new Scanner("1\n" + testCases[i])));
    }
  }

  @Test
  public void testSample2() {
    final String[] testCases = ("(-127, -48)\n"
            + "(-127.560528, -48.560528)\n"
            + "(-97, -282)\n"
            + "(-97.354318, -282.354318)\n"
            + "(-66, -43)\n"
            + "(-66.435670, -43.435670)\n"
            + "(-146, -101)\n"
            + "(-146.725709, -101.725709)\n"
            + "(-14, -113)\n"
            + "(-14.19976, -113.19976)").split("\n");

    final String[] output = ("Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid").split("\n");

    for (int i = 0; i < testCases.length; ++i) {
      assertEquals(testCases[i], output[i] + "\n", new Solution.LatitudeAndLongitude().solve(new Scanner("1\n" + testCases[i])));
    }
  }

  @Test
  public void testSample3() {
    final String[] testCases = ("(-24, -93)\n"
            + "(-24.157721, -93.157721)\n"
            + "(-79, -55)\n"
            + "(-79.540667, -55.540667)\n"
            + "(-116, -99)\n"
            + "(-116.639280, -99.639280)\n"
            + "(-122, -196)\n"
            + "(-122.85186, -196.85186)\n"
            + "(-67, -70)\n"
            + "(-67.233682, -70.233682)\n"
            + "(-64, -67)\n"
            + "(-64.780557, -67.780557)\n"
            + "(-65, -271)\n"
            + "(-65.347042, -271.347042)\n"
            + "(-32, -85)\n"
            + "(-32.84880, -85.84880)\n"
            + "(-110, -6)\n"
            + "(-110.158590, -6.158590)\n"
            + "(-130, -219)\n"
            + "(-130.581178, -219.581178)\n"
            + "(-88, -241)\n"
            + "(-88.344600, -241.344600)\n"
            + "(-6, -165)\n"
            + "(-6.871826, -165.871826)\n"
            + "(-98, -40)\n"
            + "(-98.122626, -40.122626)\n"
            + "(-6, -172)\n"
            + "(-6.377934, -172.377934)\n"
            + "(-147, -266)\n"
            + "(-147.357525, -266.357525)").split("\n");

    final String[] output = ("Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid\n"
            + "Valid\n"
            + "Valid\n"
            + "Invalid\n"
            + "Invalid").split("\n");
    
    for (int i = 0; i < testCases.length; ++i) {
      assertEquals(testCases[i], output[i] + "\n", new Solution.LatitudeAndLongitude().solve(new Scanner("1\n" + testCases[i])));
    }
  }
}
