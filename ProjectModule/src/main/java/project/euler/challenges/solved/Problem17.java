package project.euler.challenges.solved;

import java.util.HashMap;
import java.util.Map;

public class Problem17 {

  final static private Map<Integer, String> numbers = new HashMap<Integer, String>();

  public static void main(final String[] args) {
    init();

    Integer sumOfCharacters = 0;
    for (int i = 1; i <= 1000; i++) {
      final String str = convertNumberToString(i);
      final Integer length = str.replaceAll(" ", "").length();
      System.out.printf("%s (%d)\n",str, length );
      sumOfCharacters += length;
    }
    System.out.println(sumOfCharacters);
  }

  static String convertNumberToString(Integer i) {
    if (i < 20 || i == 1000) {
      return numbers.get(i);
    }

    if (2 == i.toString().length()) {
      return parse2DigitValue(i);
    }
    else if (3 == i.toString().length()) {
      Integer hundreds = Integer.parseInt(i.toString().substring(0, 1));
      
      if(0 == i%100)
      {
        return String.format("%s hundred", numbers.get(hundreds));
      }
      
      final Integer digits = Integer.parseInt(i.toString().substring(1));
      
      if(1 == digits.toString().length() || digits < 20)
      {
        return String.format("%s hundred and %s", numbers.get(hundreds), numbers.get(digits)); 
      }
      return String.format("%s hundred and %s", numbers.get(hundreds), parse2DigitValue(digits));
    }

    return null;
  }

  static void init() {
    numbers.put(1, "one");
    numbers.put(2, "two");
    numbers.put(3, "three");
    numbers.put(4, "four");
    numbers.put(5, "five");
    numbers.put(6, "six");
    numbers.put(7, "seven");
    numbers.put(8, "eight");
    numbers.put(9, "nine");
    numbers.put(10, "ten");
    numbers.put(11, "eleven");
    numbers.put(12, "twelve");
    numbers.put(13, "thirteen");
    numbers.put(14, "fourteen");
    numbers.put(15, "fifteen");
    numbers.put(16, "sixteen");
    numbers.put(17, "seventeen");
    numbers.put(18, "eighteen");
    numbers.put(19, "nineteen");
    numbers.put(20, "twenty");
    numbers.put(30, "thirty");
    numbers.put(40, "forty");
    numbers.put(50, "fifty");
    numbers.put(60, "sixty");
    numbers.put(70, "seventy");
    numbers.put(80, "eighty");
    numbers.put(90, "ninety");
    numbers.put(1000, "one thousand");
  }

  private static String parse2DigitValue(Integer i) {
    Integer digit = Integer.parseInt(i.toString().substring(1));
    Integer base = (i - digit);
    if(base == i)
    {
      return numbers.get(base);
    }
    
    return numbers.get(base) + " " + numbers.get(digit);
  }
}
