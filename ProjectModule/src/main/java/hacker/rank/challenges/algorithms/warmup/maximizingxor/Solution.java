package hacker.rank.challenges.algorithms.warmup.maximizingxor;

import java.util.Scanner;

public class Solution {
  
  public static class MaximizingXOR implements Runnable {

    public String solve(final Scanner in) {
      
      int a = in.nextInt();
      int b = in.nextInt();
      
      int xor = 0;
      for(int i = Math.max(a, b); i >= Math.min(a, b) ; --i){
        for(int j = Math.min(a, b); i > j; ++ j){
          
          //System.out.println( i + " ^ " + j + " = " + (i ^ j) );
          xor = Math.max(xor, i ^ j);
        }
      }
       
      return String.valueOf(xor);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MaximizingXOR()).run();
  }
}
