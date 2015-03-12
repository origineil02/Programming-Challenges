package attempt.hacker.rank.challenges.algorithms.summationandalgebra.wetsharkat42;

import java.util.Scanner;

public class Solution {
  
  public static class WetShark implements Runnable {

    final private int mod = ((Double)(Math.pow(10, 9) + 7)).intValue();
    
    private long bruteForce(long strength){
      for(long i = 1; ;i++){
          
        System.out.println(i + " " + strength + " | " + 42*i);
          if(i % 2 == 0){
            if(i % 42 != 0){
              strength--;
            }
          }
          if(strength == 0){
            return i % mod;
          }
      }
    }
    
    private long solution(long strength){
      long pool = 2 * strength;
        int count = 0;
        for(long i = 1; i * 42 <= pool; i++){
          count++;
        }
       return (pool + 2*count) % mod;
    }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      while(0 < testCases--){
        long strength = Long.parseLong(in.nextLine());
        
        sb.append( bruteForce(strength)).append(" vs ").append(solution(strength)).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new WetShark()).run();
  }
}
