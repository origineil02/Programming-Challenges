package hacker.rank.challenges.misc.regex.spellingstyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class SpellingStyle implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int input = in.nextInt();
      in.nextLine();
      
      final List<String> lines = new ArrayList<>();
      while(0 < input--){
        lines.add(in.nextLine());
      }

      int tests = in.nextInt();
      in.nextLine();
      
       while(0 < tests--){
        String token = in.nextLine();
        int length = token.length();
        token = token.substring(0, token.length()-2) + "[s|z]e";
        
        int total = 0;
        for(String str : lines){
          String temp = str.replaceAll(token, "");
          total += (str.length() - temp.length()) / length;
        }
        sb.append(total).append("\n");
      }
    return sb.toString();
  }

  @Override
  public void run() {
    System.out.println(solve(new Scanner(System.in)));
  }
}

public static void main(String[] args) {
    new Thread(new SpellingStyle()).run();
  }
}
