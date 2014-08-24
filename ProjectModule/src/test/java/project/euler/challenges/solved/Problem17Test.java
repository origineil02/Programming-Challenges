package project.euler.challenges.solved;

import junit.framework.TestCase;

public class Problem17Test extends TestCase {

  public Problem17Test(String testName) {
    super(testName);
  }

  public void test30() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("thirty", instance.convertNumberToString(30));
  }

  public void test45() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("forty five", instance.convertNumberToString(45));
  }

  public void test100() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("one hundred", instance.convertNumberToString(100));
  }

  public void test172() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("one hundred and seventy two", instance.convertNumberToString(172));
  }

  public void test1000() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("one thousand", instance.convertNumberToString(1000));
  }

  public void test999() {
    final Problem17 instance = new Problem17();
    instance.init();
    assertEquals("nine hundred and ninety nine", instance.convertNumberToString(999));
  }

  public void test1to5() {
    final Problem17 instance = new Problem17();
    instance.init();

    Integer sum = 0;
    for (int i = 1; i < 6; i++) {
      final String str = instance.convertNumberToString(i);
      final Integer length = str.replaceAll(" ", "").length();
      System.out.printf("%s (%d)\n", str, length);
      sum += length;
    }

    assertEquals((Integer) 19, sum);
  }
  public void test1to1000() {
    final Problem17 instance = new Problem17();
    instance.init();

    Integer sum = 0;
    for (int i = 1; i <= 1000; i++) {
      final String str = instance.convertNumberToString(i);
      final Integer length = str.replaceAll(" ", "").length();
      System.out.printf("%s (%d)\n", str, length);
      sum += length;
    }

    assertEquals((Integer) 21124, sum);
  }
}
