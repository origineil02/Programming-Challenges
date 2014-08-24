package hacker.rank.challenges.algorithms.warmup.fillingjars;

import java.util.Scanner;

public class Solution {
  
  public static class FillingJars implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int jars = in.nextInt();
      long sum = 0;
      for(int lines = in.nextInt(); lines > 0; --lines){
        
        int jarOne = in.nextInt();
        int jarTwo = in.nextInt();
        
        long fillable = jarTwo - jarOne + 1;
        
        sum += fillable * in.nextInt();
      }
      
      sb.append(sum/jars);
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new FillingJars()).run();
  }
}
