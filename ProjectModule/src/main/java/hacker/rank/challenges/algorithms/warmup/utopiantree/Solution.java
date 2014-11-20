package hacker.rank.challenges.algorithms.warmup.utopiantree;

import java.util.Scanner;

public class Solution {

  public static class UtopianTree implements Runnable {

    public String solve(final Scanner in){
      final StringBuilder sb = new StringBuilder();
      
      int terminator = in.nextInt();
      for (int i = 0; i < terminator; ++i) {

        int height = 1;
        int growthCycles = in.nextInt();
        
        for(int cycle = 1; cycle <= growthCycles; ++cycle){
            height += (0 != cycle%2 ? height : 1);
        }
        sb.append(height).append("\n");
      }
      
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new UtopianTree()).run();
  }
}
