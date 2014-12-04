package hacker.rank.challenges.algorithms.combinatronics.minimumdraws;

import java.util.Scanner;

public class Solution {
  
  public static class MinimumDraws implements Runnable {

    public String solve(final Scanner in) {
      
      int testCases = in.nextInt();
      
      final StringBuilder sb = new StringBuilder();
      while(0 < testCases--){
        sb.append(in.nextInt() +1).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MinimumDraws()).run();
  }
}
