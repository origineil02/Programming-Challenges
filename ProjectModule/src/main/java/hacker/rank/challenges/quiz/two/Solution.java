package hacker.rank.challenges.quiz.two;

import java.util.Scanner;

public class Solution {

  public static class Quiz2 implements Runnable {

    public String solve(final Scanner in) {

      return    "1:e\n"
              + "2:c\n"
              + "3:b\n"
              + "4:e\n"
              + "5:d\n"
              + "6:b\n"
              + "7:b\n"
              + "8:c\n"
              + "9:a\n"
              + "10:e";
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new Quiz2()).run();
  }
}
