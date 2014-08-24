package project.euler.challenges.solved;

import project.euler.utils.Util;


public class Problem20 {
 
  public static void main(final String[] args) {
    
    String value = Util.factorial(100).toString();
    Integer sum = sumCharacters(value);
    
    System.out.println(sum);
  }

  protected static Integer sumCharacters(String value) throws NumberFormatException {
    value = value.replaceAll("0", "");
    Integer sum = 0;
    for (Character c : value.toCharArray()) {
      sum += Integer.parseInt(c.toString());
    }
    return sum;
  }
  
  
}
