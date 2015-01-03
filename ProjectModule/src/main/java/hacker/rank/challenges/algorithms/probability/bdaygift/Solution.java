package hacker.rank.challenges.algorithms.probability.bdaygift;

import java.util.Scanner;

public class Solution {
  
  public static class BirthdayGift implements Runnable {

    public String solve(final Scanner in) {
      
      int testCases = Integer.parseInt(in.nextLine());
      Double value = 0.0;
      
      while(0<testCases--){
        value += in.nextInt() * .5;
      }
      
      return String.format("%.1f", value);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new BirthdayGift()).run();
  }
}
