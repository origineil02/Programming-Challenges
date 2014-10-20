package hacker.rank.challenges.misc.regex.ipvalidation;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "3\n"
            + "This line has junk text.  \n"
            + "121.18.19.20  \n"
            + "2001:0db8:0000:0000:0000:ff00:0042:8329";

    assertEquals("Neither\nIPv4\nIPv6\n", new Solution.IPAddressValidation().solve(new Scanner(input)));
  }

  public void testSample2() {
    final String input = "7\n"
            + "1050:1000:1000:a000:5:600:300c:326b\n"
            + "1050:1000:2000:ab00:5:600:300c:326a\n"
            + "1050:1000:3000:abc0:5:600:300c:326c\n"
            + "1051:1000:4000:abcd:5:600:300c:326b\n"
            + "22.231.113.64\n"
            + "22.231.113.164\n"
            + "222.231.113.64";

    assertEquals("IPv6\n"
            + "IPv6\n"
            + "IPv6\n"
            + "IPv6\n"
            + "IPv4\n"
            + "IPv4\n"
            + "IPv4\n", new Solution.IPAddressValidation().solve(new Scanner(input)));
  }
}
