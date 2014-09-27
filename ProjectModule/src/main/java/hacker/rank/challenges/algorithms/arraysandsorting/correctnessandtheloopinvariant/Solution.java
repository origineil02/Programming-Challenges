package hacker.rank.challenges.algorithms.arraysandsorting.correctnessandtheloopinvariant;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  
  public static class CorrectnessAndLoopInvariant implements Runnable {

    public void insertionSort(int[] A) {
      for (int i = 1; i < A.length; i++) {
        int value = A[i];
        int j = i - 1;
        while (j >= 0 && A[j] > value) {
          A[j + 1] = A[j];
          j = j - 1;
        }
        A[j + 1] = value;
      }
    }

    public String solve(final Scanner in) {
      int n = in.nextInt();
      int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt();
      }
      insertionSort(ar);
      return Arrays.toString(ar).replace("[", "").replace("]", "").replace(",", "");
    }

    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }

  }

  public static void main(String[] args) {
    new Thread(new CorrectnessAndLoopInvariant()).run();
  }
}
