package hacker.rank.challenges.algorithms.warmup.solvemesecond;

import java.util.Scanner;

public class Solution {
  
  public static class SolveMeSecond implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      
      while (0 < testCases--) {
        sb.append(in.nextInt() + in.nextInt()).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SolveMeSecond()).run();
  }
}
