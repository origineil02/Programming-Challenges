package project.euler.challenges.solved;

import project.euler.utils.Util;

public class Problem38 {

  public static void main(final String[] args) {
    System.out.println(new PandigitalMultiples().solve());
  }

  static class PandigitalMultiples {

    public String solve() {
      int i = 1;
      String max = "";

      while (i < 10000) {
        final StringBuilder sb = new StringBuilder();
        String str = "";
        for (int j = 1; j < 10; j++) {
          sb.append(i * j);

          str = sb.toString();

          if (str.contains("0")) {
            continue;
          }

          if (str.length() == 9 && Util.isPandigital(str)) {
//            System.out.printf("%d {1 - %d}: %s\n", i - 1, j, str);
            max = str;
//          System.out.printf("%d = %d\n", i, sum);
          }

        }
        ++i;
      }

      return max;
    }
  }
}
