package attempt.hacker.rank.challenges.algorithms.summationandalgebra.easysum;

import java.util.Scanner;

public class Solution {
  
  public static class EasySum implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int n  = in.nextInt();
        int m = in.nextInt();
        
        long sum =0;
        while(0 < n){
          sum += n--%m;
        }
        sb.append(sum).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new EasySum()).run();
  }
}
