package attempt.hacker.rank.challenges.algorithms.warmup.flippingbits;

import java.util.Scanner;

public class Solution {
  
  public static class FlippingBits implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int number = in.nextInt();
        
         sb.append(number ^ ~0).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new FlippingBits()).run();
  }
}
