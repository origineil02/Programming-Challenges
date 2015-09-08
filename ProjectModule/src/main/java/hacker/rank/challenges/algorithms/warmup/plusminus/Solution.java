package hacker.rank.challenges.algorithms.warmup.plusminus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  public static class PlusMinus implements Runnable {

    private static class Container {

      final Map<Key, Integer> map = new HashMap<>();
      final int size;

      enum Key {

      POSTIVE,
      NEGATIVE,
      ZERO;

      static Key getValue(int value) {
        return 0 == value ? ZERO
                : 0 > value ? NEGATIVE
                : POSTIVE;
      }
    }
      
      Container(int size) {
        this.size = size;
        for (Key k : Key.values()) {
          map.put(k, 0);
        }
      }

      void addValue(int value) {
        final Key key = Key.getValue(value);
        map.put(key, map.get(key) + 1);
      }

      String getResult(final Precision precision) {
        final StringBuilder sb = new StringBuilder();
        for (Key k : Key.values()) {
          sb.append(precision.getValue(map.get(k), size))
                  .append("\n");
        }
        return sb.toString().trim();
      }
    }

    private class Precision {

      private final int precision;

      public Precision(int p) {
        this.precision = p;
      }

      String getValue(double value, double size) {
        return new BigDecimal(value / size).setScale(precision, RoundingMode.HALF_UP).toString();
      }
    }

    public String solve(final Scanner in) {
      int size = in.nextInt();
      in.nextLine();

      final Container container = new Container(size);

      for (int i = 0; i < size; ++i) {
        container.addValue(in.nextInt());
      }

      return container.getResult(new Precision(3));
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new PlusMinus()).run();
  }
}
