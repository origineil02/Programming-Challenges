package project.euler.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import project.euler.models.FactorPair;
import project.euler.models.Factors;
import project.euler.models.PrimeFactors;

public class Util {

  public static boolean isPalindrome(final String str) {
    final char[] characters = str.toCharArray();
    for (int i = 0, j = str.length() - 1;; i++, --j) {
      if (i == j || j < i) {
        return true;
      }

      if (characters[i] != characters[j]) {
        return false;
      }
    }
  }

  public static Map<String, Integer> getAlphabetValueMap() {
    final Map<String, Integer> map = new HashMap<String, Integer>();

    for (int i = 65; i < 91; i++) {
      final Character c = (char) i;
      map.put(c.toString(), i - 64);
      map.put(c.toString().toLowerCase(), i - 64);
    }
    return map;
  }

  public static Integer wordToValueConversion(final String word) {
    Integer sum = 0;
    final Map<String, Integer> map = getAlphabetValueMap();
    for (Character c : word.toCharArray()) {
      sum += map.get(c.toString());
    }
    return sum;
  }

  public static BigInteger combinations(int n, int r) {
    final BigInteger nFactorial = factorial(n);
    final BigInteger rFactorial = factorial(r);
    final BigInteger nMinusRFactorial = factorial(n - r);
    final BigInteger denomiator = rFactorial.multiply(nMinusRFactorial);
    return nFactorial.divide(denomiator);
  }

  public static BigInteger factorial(Integer value) {
    BigInteger product = BigInteger.ONE;
    for (int i = value; i > 0; --i) {
      product = product.multiply(BigInteger.valueOf(i));
    }
    return product;
  }

  public static Factors getFactorsObj(final BigInteger value) {
    final Set<Integer> factors = getFactors(value);
    final Factors obj = new Factors();
    for (Integer integer1 : factors) {
      for (Integer integer2 : factors) {
        if (integer1 * integer2 == value.intValue()) {
          obj.addFactorPair(new FactorPair(integer1, integer2));
        }
      }
    }
    return obj;
  }

  public static Set<Integer> getFactors(BigInteger value) {

    if (0 == value.intValue()) {
      return new HashSet();
    }

    if (1 == value.intValue()) {
      return new HashSet(Arrays.asList(1));
    }

    final Set<Integer> primeFactors = Util.primeFactors(value);
    final Set<Integer> factors = new HashSet<Integer>(primeFactors);

    for (Integer prime : primeFactors) {
      final Integer x = value.intValue() / prime;
      factors.add(x);
      factors.addAll(getFactors(BigInteger.valueOf(x)));
    }

    return factors;
  }

  public static Set<Integer> primes(final BigInteger value) {
    final Set<Integer> primes = new TreeSet<Integer>(Arrays.asList(2));
    BigInteger i = BigInteger.valueOf(3);
    while (i.intValue() < value.intValue()) {

      boolean isPrime = true;
      for (Integer integer : primes) {
        final BigInteger temp = BigInteger.valueOf(integer);
        if (0 == i.mod(temp).intValue()) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        primes.add(i.intValue());
      }

      i = i.add(BigInteger.valueOf(2));
    }

    return primes;
  }

  public static boolean primalityTest_AKSMethodStep1(Long value) {
    if (value < 1000) {
      return isPrime(BigInteger.valueOf(value));
    }

    for (Long a = 2L; a < Math.sqrt(Double.valueOf(value)); a++) {
      for (Long b = 2L; b < Math.sqrt(Double.valueOf(value)); b++) {
        final Double x = Math.pow(Double.valueOf(a), Double.valueOf(b));

        if (x > value) {
          break;
        }
        System.out.printf("%s vs %s ^ %s = %s\n", value.toString(), a.toString(), b.toString(), x.toString());
        if (x.longValue() == value) {
          return false;
        }
      }
    }

    return true;
  }

  public static boolean isPrime2(Double x) {
    if (x.intValue() < 5) {
      return x.intValue() != 4;
    }
    else if (77 == x.intValue()) {
      return false;
    }

    Double value = x * x;
    value = value + 17;

    final Double result = value / 12;
    final String str = result.toString();

    String decimalValue = "";
    if (str.contains("E")) {
      final String[] tokens = str.split("E");
      final Integer i = Integer.parseInt(tokens[1]);
      final String local = tokens[0].split("\\.")[1];
      decimalValue = local.substring(i > local.length() ? local.length() : i);
    }
    else {
      decimalValue = str.split("\\.")[1];
    }

    //System.out.printf("%f : %s | %s\n ",x,result.toString(), decimalValue);
    return (5 == Long.parseLong(decimalValue.isEmpty() ? "0" : decimalValue));
  }

  public static boolean isPrime(BigInteger value) {
    final Set<Integer> primes = new HashSet<Integer>(Arrays.asList(2));
    BigInteger i = BigInteger.valueOf(3);
    while (value.intValue() != 1) {

      boolean isPrime = true;
      for (Integer integer : primes) {
        final BigInteger temp = BigInteger.valueOf(integer);
        if (0 == i.mod(temp).intValue()) {
          isPrime = false;
        }
        if (0 == value.mod(temp).intValue()) {
          if (value.intValue() != temp.intValue()) {
            return false;
          }

          value = value.divide(temp);
        }
      }

      if (isPrime) {
        primes.add(i.intValue());
      }

      i = i.add(BigInteger.valueOf(2));
    }
    return true;
  }

  public static Set<Integer> primeFactors(BigInteger value) {
    final Set<Integer> primes = new HashSet<Integer>(Arrays.asList(2));
    final PrimeFactors primeFactors = new PrimeFactors();
    BigInteger i = BigInteger.valueOf(3);
    while (value.intValue() != 1) {

      boolean isPrime = true;
      for (Integer integer : primes) {
        final BigInteger temp = BigInteger.valueOf(integer);
        if (0 == i.mod(temp).intValue()) {
          isPrime = false;
        }

        if (0 == value.mod(temp).intValue()) {
          primeFactors.add(integer);
          value = value.divide(temp);
        }
      }

      if (isPrime) {
        primes.add(i.intValue());
      }

      i = i.add(BigInteger.valueOf(2));
    }

    return primeFactors.values();
  }

  public static PrimeFactors primeFactorsObj(BigInteger value) {
    final Set<Integer> primes = new HashSet<Integer>(Arrays.asList(2));
    final PrimeFactors primeFactors = new PrimeFactors();
    BigInteger i = BigInteger.valueOf(3);
    while (value.intValue() != 1) {

      boolean isPrime = true;
      for (Integer integer : primes) {
        final BigInteger temp = BigInteger.valueOf(integer);
        if (0 == i.mod(temp).intValue()) {
          isPrime = false;
        }

        if (0 == value.mod(temp).intValue()) {
          primeFactors.add(integer);
          value = value.divide(temp);
        }
      }

      if (isPrime) {
        primes.add(i.intValue());
      }

      i = i.add(BigInteger.valueOf(2));
    }

    return primeFactors;
  }

  public static String generatePandigital(int j, boolean includeZero) {
    final StringBuilder sb = new StringBuilder();
    for (int i = j; i > (includeZero ? -1 : 0); --i) {
      sb.append(i);
    }
    return sb.toString();
  }

  public static boolean isPandigital(final String str) {
    List<Character> list = new ArrayList<Character>();
    for (Character a : str.toCharArray()) {
      final String temp = str.replaceAll(a.toString(), "");
      if (temp.length() != str.length() - 1) {
        return false;
      }
      list.add(a);
    }

    Collections.sort(list);
    for (int i = 1; i <= str.length(); i++) {
      final Integer x = Integer.parseInt(list.get(i - 1).toString());
      if (x != i) {
        return false;
      }
    }
    return true;
  }

  public static Set<String> permutate(final Integer value) {
    return permutate(value.toString());
  }

  public static Set<String> permutate(final String value) {
    final Set<String> permutations = new HashSet<String>();

    if (value.length() <= 2 && 10 > Integer.parseInt(value)) {

      if (value.startsWith("0")) {
        permutations.add(Integer.valueOf(value).toString() + "0");
      }
      permutations.add(value.toString());
      return permutations;
    }

    final String str = value;

    for (int i = 0; i < str.length(); i++) {
      final String subString = str.substring(0, i) + str.substring(i + 1 > str.length() ? i : i + 1);
      final Set<String> sub = permutate(subString);
      for (String string : sub) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(i))
                .append(string);
        permutations.add(sb.toString());
      }
    }

    return permutations;
  }

  public static Set<String> rotate(final Integer value) {
    final Set<String> rotations = new HashSet<String>();

    if (value < 10) {
      rotations.add(value.toString());
      return rotations;
    }

    String str = value.toString();
    rotations.add(str);

    for (int i = 0; i < str.length() - 1; i++) {
      final StringBuilder sb = new StringBuilder();
      sb.append(str.substring(1))
              .append(str.charAt(0));

      str = sb.toString();
      rotations.add(str);
    }
    return rotations;
  }

  public static boolean isRightTriangle(int a, int b, int c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }

  public static Integer generatePentagonal(int x) {
    return x * (3 * x - 1) / 2;
  }

  public static Integer generateTriagonal(int x) {
    return x * (x + 1) / 2;
  }

  public static Integer generateHexagonal(int x) {
    return x * (2 * x - 1);
  }

  public static String reverse(String str) {
    final StringBuilder sb = new StringBuilder();
    final char[] array = str.toCharArray();
    for (int i = str.length() - 1; i >= 0; --i) {
      sb.append(array[i]);
    }

    return sb.toString();
  }

  public static BigInteger sumDigits(final String value) {
    BigInteger sum = BigInteger.ZERO;

    if (!value.matches("[0-9]+")) {
      return sum;
    }

    for (Character c : value.toCharArray()) {
      sum = sum.add(new BigInteger(c.toString()));
    }

    return sum;
  }

  public static long gcd(long a, long b) {
    long max = Math.max(a, b);
    long min = Math.min(a, b);

    while (min != 0) {
      long t = min;
      min = max % min;
      max = t;
    }
    return max;
  }

  public static int relativePrimes(int value) {

    if (1 == value) {
      return 1;
    }

    int count = 0;
    for (int j = value - 1; j >= 1;) {
      if (1 == gcd(value, j)) {
        count++;
      }
      j = (value % 2 == 0 ? j - 2 : j - 1);
    }
    return count;
  }

  public static List<String> summations(int number) {

    final Set<String> summations = new HashSet<String>();

    String str = String.format("%0" + number + "d", 1);
    str = str.replaceAll("0", "1");

    summations.add(str);

    final List<String> sequences = new LinkedList<String>();
    sequences.add(str);

    while (!sequences.isEmpty() && sequences.get(0).length() > 1) {

      final List<String> additional = getSequences(sequences.get(0), sequences);
      summations.addAll(additional);
      sequences.remove(0);
    }

    final List<String> ret = new ArrayList<String>(summations);
    Collections.sort(ret);
    
    final List<String> reversals = new ArrayList<String>();
    for (String string : ret) {
      final String rev = Util.reverse(string);
      if(ret.contains(rev) && !string.equals(rev) && !reversals.contains(rev)){
        reversals.add(string);
      }
    }
    
    ret.removeAll(reversals);
    
    return ret;
  }

  static List<String> getSequences(String str, List<String> sequences) {
    final List<String> summations = new LinkedList<String>();
    while (str.length() != 2) {

      Integer one = Integer.valueOf(str.substring(0, 1));
      Integer two = Integer.valueOf(str.substring(1, 2));

      String temp = String.valueOf(one + two).concat(str.substring(2));
      summations.add(temp);


      if (temp.length() > 2) {
        sequences.add(temp);
        sequences.add(Util.reverse(temp));
      }

      str = temp;
    }
    return summations;
  }
}
