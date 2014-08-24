package hacker.rank.challenges.algorithms.warmup.halloweenparty;

import java.util.Scanner;

public class Solution {
  
  public static class HalloweenParty implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      for(int testCases = in.nextInt(); testCases > 0; --testCases){
      
        int barSize = in.nextInt();
        
        boolean even = barSize % 2 == 0;
        long half = barSize/2;
        long pieces =  half * (even ? half : half + 1);
        
        System.out.println(pieces);
        sb.append(pieces).append("\n");
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new HalloweenParty()).run();
  }
}
