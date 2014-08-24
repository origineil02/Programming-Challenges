package hacker.rank.challenges.algorithms.warmup.sherlockandthebeast;

import java.util.Scanner;

public class Solution {

  public static class SherlockAndTheBeast implements Runnable {

    private String solve(int digits){
      
      final StringBuilder sb = new StringBuilder();
      int length = digits;
      
         while(digits > 0){
           
           if(digits % 3 == 0){
             while(digits >= 3){
              sb.insert(0, "555");
              digits -= 3;
             }
           }
           else {
             sb.append("33333");
             digits -= 5;
           }
          }

      final String answer = sb.toString();
      if(answer.isEmpty() || answer.length() != length){
        return "-1";
      }
      
      return answer;
    }
    
    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();

      for (int testCases = in.nextInt(); testCases > 0; --testCases) {
         
       final String answer = solve(in.nextInt());
       System.out.println(answer);
       sb.append(answer).append("\n");
      }

      return sb.toString();
    }

    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new SherlockAndTheBeast()).run();
  }
}


