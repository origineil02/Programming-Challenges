package hacker.rank.challenges.algorithms.sorting.findingthemean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class FindingTheMean implements Runnable {

    public String solve(final Scanner in) {

      int size = in.nextInt();
      final List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(in.nextInt());
      }
      Collections.sort(list);
      return list.get(size/2).toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new FindingTheMean()).run();
  }
}
