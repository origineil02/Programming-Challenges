package hacker.rank.challenges.misc.regex.splitthephonenumbers;

import java.util.Scanner;

public class Solution {
  
  public static class SplitThePhoneNumbers implements Runnable {

    public String solve(final Scanner in) {
      final String template = "CountryCode=%s,LocalAreaCode=%s,Number=%s";
      final StringBuilder sb = new StringBuilder();

      int testCases = in.nextInt();
      in.nextLine();
      while(0 < testCases--){
        final String[] tokens = in.nextLine().split("[\\s|-]");
        sb.append(String.format(template, tokens)).append("\n");
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SplitThePhoneNumbers()).run();
  }
}
