package hacker.rank.challenges.misc.regex.validpanformat;

import java.util.Scanner;

public class Solution {
  
  public static class ValidPanFormat implements Runnable {

    //<char><char><char><char><char><digit><digit><digit><digit><char>
    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      final int testCases = in.nextInt();
      in.nextLine();
      for(int i = 0; i < testCases; ++i){
        final String pan = in.nextLine();
        boolean flag = pan.length() == 10 && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        sb.append(flag ? "YES" : "NO").append("\n");
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new ValidPanFormat()).run();
  }
}
