package hacker.rank.challenges.algorithms.arraysandstrings.intrototutorialchallenges;

import java.util.Scanner;

public class Solution {
  public static class IntroToTutorialChallenges implements Runnable {

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();

      final int target = in.nextInt();
      final int size = in.nextInt();
      for (int index = 0; index < size; ++index) {
         if(in.nextInt() == target){
           return String.valueOf(index);
         }
      }

      return sb.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new IntroToTutorialChallenges()).run();
  }
}
