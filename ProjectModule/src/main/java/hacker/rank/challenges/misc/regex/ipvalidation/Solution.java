package hacker.rank.challenges.misc.regex.ipvalidation;

import java.util.Scanner;

public class Solution {

  public static class IPAddressValidation implements Runnable {

    public String solve(final Scanner in) {

      final String ipv4 = "(2[0-5]{2}|1?[0-9]{2}|[0-9])";
      final String ipv6 = "([0-9|a-f]{1,4})";
      int testCases = in.nextInt();
      in.nextLine();

      final StringBuilder sb = new StringBuilder();
      while (0 < testCases--) {
        final String line = in.nextLine().trim();
        if (line.matches("("+ipv4+"\\.){3}"+ipv4)) {
          sb.append("IPv4");
        }
        else if (line.matches("(" +ipv6+ ":){7}"+ipv6)) {
          sb.append("IPv6");
        }
        else {
          sb.append("Neither");
        }
        sb.append("\n");
      }

    return sb.toString();
  }

  @Override
  public void run() {
    System.out.println(solve(new Scanner(System.in)));
  }
}

public static void main(String[] args) {
    new Thread(new IPAddressValidation()).run();
  }
}
