package project.euler.challenges.solved;

public class Problem30 {

  public static void main(final String[] args) {
    System.out.println(new DigitFifthPower().solve());
  }

  static class DigitFifthPower {

    public Integer solve() {
      Integer sum = 0;
      for (Integer integer = 2; integer < 500000; integer++) {
        final String str = integer.toString();

        StringBuilder sb = new StringBuilder();
        sb.append(str)
                .append(" : ");

        boolean fail = false;
        Integer digitSum = 0;
        for (Character c : str.toCharArray()) {
          final Double character = Double.valueOf(c.toString());
          final Double d = Math.pow(character, 5.0);

          if (integer == 1634) {
            System.out.println("");
          }
          if (d.intValue() > integer) {
            fail = true;
            sb = new StringBuilder();
            break;
          }

          sb.append(String.format("%s ^ 5 = %.2f | ", c.toString(), d));
          digitSum += d.intValue();
        }

        if (!fail) {
          sb.append(" Sum: " + digitSum);
          //System.out.println(sb.toString());
          if (digitSum.intValue() == integer) {
            sum += integer;
            System.out.println("Found " + integer);
          }
        }
      }
      return sum;
    }
  }
}
