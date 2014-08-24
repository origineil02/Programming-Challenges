package hacker.rank.challenges.algorithms.warmup.finddigits;

import java.util.Scanner;

public class Solution {
  
  public static class FindDigits implements Runnable {

    public String solve(final Scanner in) {
      final StringBuilder sb = new StringBuilder();
      
      int terminator = in.nextInt();
      in.nextLine();
      for(int testCases = terminator; testCases > 0; --testCases){
        int sum = 0;
        
        String line = in.nextLine();
        Long value = Long.parseLong(line);
        
        line = line.replace("0", "");
        boolean bool = true;
        while(bool){
          
          final Character c = line.charAt(0);
          
          int length = line.length();
          line = line.replace(c.toString(), "");
          
          if(0 == value % Character.getNumericValue(c)){
            sum += length - line.length();
          }
          
          bool = !line.isEmpty();
        }
         System.out.println(sum);
         sb.append(sum).append("\n");
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new FindDigits()).run();
  }
}
