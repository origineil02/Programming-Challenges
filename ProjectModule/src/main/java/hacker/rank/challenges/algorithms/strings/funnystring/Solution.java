package hacker.rank.challenges.algorithms.strings.funnystring;

import java.util.Scanner;

public class Solution {
  
  public static class FunnyString implements Runnable {

    private boolean isFunny(char[] str){
      for(int i = 1; i<str.length; ++i){
         int tail = str.length-i;
         if(Math.abs(str[i] - str[i-1]) != Math.abs(str[tail] - str[tail-1])) {
           return false; 
         }
      }
      return true;
    }
    public String solve(final Scanner in) {
      
      int testCases = in.nextInt();
      in.nextLine();
      
      final StringBuilder sb = new StringBuilder();
      while(0 < testCases--){
        final char[] str = in.nextLine().toCharArray();
        sb.append(!isFunny(str) ? "Not " : "")
          .append("Funny\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new FunnyString()).run();
  }
}
