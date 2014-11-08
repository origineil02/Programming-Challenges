package hacker.rank.challenges.algorithms.numbertheory.restaurant;

import java.util.Scanner;

public class Solution {

  public static class Restaurant implements Runnable {

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int l = in.nextInt();
        int b = in.nextInt();
        
        int max = 1;
        for(int i = 2; i <= Math.min(l, b); ++i){
          if(l %i == 0 && b % i == 0){
            max = i;
          }
        }
            
        sb.append(l/max * b/max).append("\n");
      }
      
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new Restaurant()).run();
  }
}
