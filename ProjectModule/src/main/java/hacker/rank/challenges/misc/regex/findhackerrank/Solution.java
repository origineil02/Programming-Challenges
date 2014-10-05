package hacker.rank.challenges.misc.regex.findhackerrank;

import java.util.Scanner;

public class Solution {
  
  public static class FindHackerRank implements Runnable {

    public String solve(final Scanner in) {
      
      final String starts = "hackerrank.*";
      final String ends = ".*hackerrank";
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      in.nextLine();
      while(0 < testCases--){
        final String str = in.nextLine();
        sb.append(str.matches(starts)? str.matches(ends)? "0" : "1" : str.matches(ends) ? "2" : "-1").append("\n");
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new FindHackerRank()).run();
  }
}
