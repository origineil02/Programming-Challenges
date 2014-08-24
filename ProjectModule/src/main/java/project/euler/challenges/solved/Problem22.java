package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem22 {

  public static void main(final String[] args) throws FileNotFoundException {

    System.out.println(processData());
 
  }

  static Integer processData() throws FileNotFoundException {
       final Scanner scanner = new Scanner(new FileInputStream(new File("./src/main/resources/Problem22Names.txt")));

    Integer sum = 0;
    while (scanner.hasNext()) {
      final String[] nameArray = scanner.next().split(",");

      final List<String> data = Arrays.asList(nameArray);
      Collections.sort(data);
      
      final NameScore scorer = new NameScore();
      for (int i = 0; i < data.size(); i++) {
        final String str = data.get(i);
        
        sum += scorer.calculate(str) * (i+1);
      }
    }

    return sum;
  }
  static class NameScore {

    public Integer calculate(final String str) {
      final String name = str.substring(1, str.length() - 1);

      Integer nameValue = 0;
      for (Character c : name.toCharArray()) {
        nameValue += Util.getAlphabetValueMap().get(c.toString().toLowerCase());
      }

      return nameValue;
    }
  }
}
