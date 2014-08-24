package project.euler.challenges.solved;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {

  public static void main(final String[] args) throws FileNotFoundException {

    sum();
  }

  static String sum() throws FileNotFoundException {
    final Scanner scanner = new Scanner(new FileInputStream(new File("./src/main/resources/Problem13Data.txt")));
    BigInteger value = new BigInteger("0");
    while (scanner.hasNext()) {
      final String line = scanner.next();
      value = value.add(new BigInteger(line));
    }

    return value.toString().substring(0, 10);
  }
}
