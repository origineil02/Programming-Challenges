package hacker.rank.challenges.algorithms.warmup.alternatingcharacters;

import java.util.Scanner;

public class Solution {
  
  public static class AlternatingCharacters implements Runnable {

    public String solve(final Scanner in) {
      
      int testCases = in.nextInt();
      in.nextLine();
      
      final StringBuilder sb = new StringBuilder();
      while(testCases-- > 0){
        final String input = in.nextLine();
        
        int removed = 0;
        for(int i = 1; i < input.length(); ++i){
          if(input.charAt(i) == input.charAt(i-1)){
            removed++;
          }
           
        }
        sb.append(removed).append("\n");
      }
      
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new AlternatingCharacters()).run();
  }
}
