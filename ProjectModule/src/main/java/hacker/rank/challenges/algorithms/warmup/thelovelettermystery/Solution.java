package hacker.rank.challenges.algorithms.warmup.thelovelettermystery;

import java.util.Scanner;

public class Solution {
  
  public static class TheLoveLetterMyster implements Runnable {

    public String solve(final Scanner in) {
      final StringBuilder sb = new StringBuilder();
      int terminator = in.nextInt();
      in.nextLine();
      
      final int offset = (int)'a';
      
      for(int i = 0; i < terminator; ++i){
        
        final char[] line = in.nextLine().toCharArray();
        //System.out.println(String.valueOf(line));
        int sum = 0;
        for(int front = 0, back = line.length-1; front < back; front++, back--){
          int f = line[front] - offset,
              b = line[back] - offset;
          
          sum += Math.max(f, b) - Math.min(f, b);
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
    new Thread(new TheLoveLetterMyster()).run();
  }
}
