package hacker.rank.challenges.misc.regex.sayinghi;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
  
  public static class SayingHi implements Runnable {
    
    public String solve(final Scanner in) {
      int testCases = in.nextInt();
      in.nextLine();
      
      final Pattern p = Pattern.compile("hi (?!d).*", Pattern.CASE_INSENSITIVE);
      final StringBuilder sb = new StringBuilder();
      while (0 < testCases--) {
        final String line = in.nextLine();
        if (p.matcher(line).matches()) {
          sb.append(line).append("\n");
        }
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args) {
    new Thread(new SayingHi()).run();
  }
}
