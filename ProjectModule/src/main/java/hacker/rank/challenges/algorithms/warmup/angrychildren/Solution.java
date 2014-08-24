package hacker.rank.challenges.algorithms.warmup.angrychildren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class AngryChildren implements Runnable {

    public String solve(final Scanner in) {

      int packets = in.nextInt();
      int k = in.nextInt();
      Integer min = Integer.MAX_VALUE;
      final List<Integer> list = new ArrayList<>();

      for (; packets > 0; --packets) {
        list.add(in.nextInt());
      }

      Collections.sort(list);

      for (int i = k; i < list.size(); i += 1) {
        int a = list.get(i - k);
        int b = list.get(i - 1);

        min = Math.min(min, Math.max(a, b) - Math.min(a, b));
      }
      return min.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new AngryChildren()).run();
  }
}
