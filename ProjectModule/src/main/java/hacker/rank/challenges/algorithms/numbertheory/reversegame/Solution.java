package hacker.rank.challenges.algorithms.numbertheory.reversegame;

import java.util.Scanner;

public class Solution {

  public static class ReverseGame implements Runnable {

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int size = in.nextInt();
        int ball = in.nextInt();
        
        int tail = size - 1;
        int head = 0;
        for(int i = 1; i <= size; ++i){
          int pos = i%2 == 0 ? head : tail;
          sb.append(pos==ball ? i-1 : "");
          
          if(i%2 == 0){ head++;} else { tail--;}
        }
        sb.append("\n");
        
      }
      
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new ReverseGame()).run();
  }
}