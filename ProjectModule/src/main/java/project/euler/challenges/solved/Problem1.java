package project.euler.challenges.solved;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

  public static class SummationOfMultiples implements Runnable {

    public String solve() {
      final List<Integer> values = new ArrayList<>();
      Integer sum = 0;
      for (int i = 0; i < 1000; i++) {

        if (0 == i % 3 || 0 == i % 5) {
          values.add(i);
        }
      }
      for (Integer integer : values) {
        sum += integer;
      }
      return sum.toString();
    }

    @Override
    public void run() {
      solve();
    }

  }

  public static void main(String[] args) {
    new Thread(new SummationOfMultiples()).run();
  }
}
