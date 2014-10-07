package hacker.rank.challenges.algorithms.geometry.rectangulargame;

import java.util.Scanner;

public class Solution {
  
  public static class RectangularGame implements Runnable {

    public String solve(final Scanner in) {
      
      int terminator = in.nextInt();
      in.nextLine();
      
      int a = Integer.MAX_VALUE;
      int b = Integer.MAX_VALUE;
      while(0 < terminator--){
        a = Math.min(a, in.nextInt());
        b = Math.min(b, in.nextInt());
      }
      
      long result = (long)a * b;
      return String.valueOf(result);
    }
    
    @Override
    public void run() {
      System.out.println( solve(new Scanner(System.in)) ); 
    }
  }
  
  public static void main(String[] args){
    new Thread(new RectangularGame()).run();
  }
}
