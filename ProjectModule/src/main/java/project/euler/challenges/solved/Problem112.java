package project.euler.challenges.solved;

public class Problem112 {
  public static class BouncyNumbers implements Runnable {

    private boolean isBouncy(Integer value) {

      boolean increasing = true;
      boolean decreasing = true;
      final String str = value.toString();
      char[] c = str.toCharArray();
      int length = str.length();
      for (int i = 1; i < length; ++i) {
        if (c[i] > c[i - 1]) {
          increasing = false;
        }
        if (c[i] < c[i - 1]) {
          decreasing = false;
        }
      }
      return !(increasing || decreasing);
    }

    public String solve() {
      Integer value = 21781;
      int bouncy = 19602;

      while (true) {
        if (isBouncy(value)) {
          bouncy++;

          int percentange = bouncy * 100 / value;
          //System.out.println(value + " : " + percentange);
          if (99 == percentange) {
            break;
          }
        }
        value++;
      }

      return value.toString();
    }

    @Override
    public void run() {
      solve();
    }
  }

  public static void main(String[] args) {
    new Thread(new BouncyNumbers()).run();
  }
}
