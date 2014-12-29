package hacker.rank.challenges.quiz.one;

import java.util.Scanner;

public class Solution {

  public static class Quiz implements Runnable {

    public String solve(final Scanner in) {

      return "1:c\n"
              + "2:b\n"
              + "3:b\n"
              + "4:a\n"
              + "5:b\n"
              + "6:a\n"
              + "7:a\n"
              + "8:c\n"
              + "9:a\n"
              + "10:e";
    }

    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new Quiz()).run();
  }
}
