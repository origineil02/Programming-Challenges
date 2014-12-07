package hacker.rank.challenges.algorithms.combinatronics.handshake;

import java.util.Scanner;

public class Solution {
  
  public static class Handshake implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      
      while(0 < testCases--){
        int size = in.nextInt();
        int handshakes=0;
        while(1 < size){
          handshakes += --size;
        }
        sb.append(handshakes).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new Handshake()).run();
  }
}
