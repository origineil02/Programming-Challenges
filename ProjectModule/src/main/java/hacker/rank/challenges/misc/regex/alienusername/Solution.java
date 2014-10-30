package hacker.rank.challenges.misc.regex.alienusername;

import java.util.Scanner;

public class Solution {
  
  public static class AlienUsername implements Runnable {

    public String solve(final Scanner in) {
      final StringBuilder sb = new StringBuilder();
      
      int testCases = in.nextInt();
      in.nextLine();
      
      while(0 < testCases--){
        final String input = in.nextLine();
        sb.append(input.matches("(_|\\.)[0-9]+[a-zA-Z]*_?")? "" : "IN")
          .append("VALID\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new AlienUsername()).run();
  }
}
