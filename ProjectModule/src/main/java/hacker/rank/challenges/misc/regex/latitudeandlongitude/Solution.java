package hacker.rank.challenges.misc.regex.latitudeandlongitude;

import java.util.Scanner;

public class Solution {

  public static class LatitudeAndLongitude implements Runnable {

    public String solve(final Scanner in) {

      int testCases = in.nextInt();
      in.nextLine();

      final String _90 = "(90|90\\.0+)";
      final String latDigits = "([1-9]|[1-8][0-9]|)";
      final String latitude = "[\\+|\\-]?(" + _90 + "|(" + latDigits + "|" + latDigits + "\\.[0-9]+))";
      final String _180 = "(180|180\\.0+)";
      final String longdDigits = "([1-9]|[1-9][0-9]|1[0-7][0-9])";
      final String longitude = "[\\+|\\-]?(" + _180 + "|" + longdDigits + "|" + longdDigits + "\\.[0-9]+)";

      final StringBuilder sb = new StringBuilder();
      while (0 < testCases--) {
        final String line = in.nextLine();
        sb.append(line.matches("\\(" + latitude + ", " + longitude + "\\)") ? "Valid" : "Invalid").append("\n");
      }
      return sb.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new LatitudeAndLongitude()).run();
  }
}
