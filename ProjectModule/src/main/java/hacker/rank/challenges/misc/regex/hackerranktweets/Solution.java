package hacker.rank.challenges.misc.regex.hackerranktweets;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
  
  public static class HackerRankTweets implements Runnable {
    
    public String solve(final Scanner in) {
      int lines = in.nextInt();
      in.nextLine();
      
      final Pattern p = Pattern.compile(".*hackerrank.*", Pattern.CASE_INSENSITIVE);

      int sum = 0;
      while (lines-- > 0) {
        final String line = in.nextLine();
        if (p.matcher(line).matches()) {
          sum++;
        }
      }
      return String.valueOf(sum);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args) {
    new Thread(new HackerRankTweets()).run();
  }
}
