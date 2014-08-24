package project.euler.challenges.solved;

import java.util.LinkedHashSet;
import java.util.Set;
import project.euler.utils.Util;

public class Problem74 {

  public static void main(final String[] args) {
    System.out.println(new DigitFactorialChains().solve());
  }

  static class DigitFactorialChains {

    public String solve() {
      int count = 0;
      for (int i = 69; i < 1000000; i++) {
        final Set<String> chain = new LinkedHashSet<String>();
        boolean shouldContinue = true;
        int value = i;
        chain.add(String.valueOf(i));
        while (shouldContinue) {
          Integer sum = process(value);

          if (chain.contains(sum.toString())) {
            shouldContinue = false;

            if (60 == chain.size()) {
              count++;
            }
          }
          else {
            chain.add(sum.toString());
            value = sum;
          }
        }

      }
      return String.valueOf(count);
    }

    protected Integer process(int i) throws NumberFormatException {
      final String str = Integer.valueOf(i).toString();
      Integer sum = 0;
      for (int j = 0; j < str.length(); j++) {
        Integer digit = Integer.valueOf(String.valueOf(str.charAt(j)));
        sum += Util.factorial(digit).intValue();
      }

      return sum;
    }
  }
}
