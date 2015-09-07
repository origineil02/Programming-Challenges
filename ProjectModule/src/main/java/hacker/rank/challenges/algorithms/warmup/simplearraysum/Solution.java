package hacker.rank.challenges.algorithms.warmup.simplearraysum;

import java.util.Scanner;

public class Solution {
  
  public static class SimpleArraySum implements Runnable {

    public String solve(final Scanner in) {
      int length = in.nextInt();
      in.nextLine();
      
      long sum = 0;
      while(0 < length--){
        sum += in.nextInt();
      }
      
      return "" + sum;
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SimpleArraySum()).run();
  }
}
