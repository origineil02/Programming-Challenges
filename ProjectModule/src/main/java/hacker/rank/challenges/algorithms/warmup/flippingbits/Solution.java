package hacker.rank.challenges.algorithms.warmup.flippingbits;

import java.util.Scanner;

public class Solution {
  
  public static class FlippingBits implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        final long number = in.nextLong();
        String binary = Long.toBinaryString(~number);
        sb.append(Long.parseLong(binary.substring(binary.length()-32), 2)).append("\n");
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
