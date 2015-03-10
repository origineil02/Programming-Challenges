package attempt.hacker.rank.challenges.algorithms.summationandalgebra.wetsharkat42;

import java.util.Scanner;

public class Solution {
  
  public static class WetShark implements Runnable {

    final private int mod = ((Double)(Math.pow(10, 9) + 7)).intValue();
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int strength = in.nextInt();
        
        for(int i = 1; ;i++){
          
          if(i % 2 == 0){
            if(i % 42 != 0){
              strength--;
            }
          }
          if(strength == 0){
            sb.append(i % mod).append("\n");
            break;
          }
        }
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
