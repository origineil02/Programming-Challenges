package hacker.rank.challenges.algorithms.warmup.averybigsum;

import java.util.Scanner;

public class Solution {
  
  public static class AVeryBigSum implements Runnable {

    public String solve(final Scanner in) {
      int size = in.nextInt();
      
      Long sum = 0L;
      while(0 < size--) {
        sum += in.nextInt();
      }
      
      return sum.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new AVeryBigSum()).run();
  }
}
