package hacker.rank.challenges.algorithms.warmup.solvemefirst;

import java.util.*;

public class Solution {

  static int solveMeFirst(int a, int b) {
    return a + b;
  }

  public static class SolveMeFirst implements Runnable {

    public String solve(final Scanner in) {
      int sum = solveMeFirst(in.nextInt(), in.nextInt());
      System.out.println(sum);
      return String.valueOf(sum);
    }

    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new SolveMeFirst());
  }
}
