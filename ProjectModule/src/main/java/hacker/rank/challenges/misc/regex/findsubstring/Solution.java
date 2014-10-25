package hacker.rank.challenges.misc.regex.findsubstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class FindSubstring implements Runnable {

    public String solve(final Scanner in) {

      int param1 = in.nextInt();
      in.nextLine();

      final StringBuilder sb = new StringBuilder();
      final List<String> list = new ArrayList<>();
      while (0 < param1--) {
        list.add(in.nextLine());
      }
      
      final String requirement = "[a-z|A-Z|0-9|_]{1}";
      
      int param2 = in.nextInt();
      in.nextLine();
      while(0 < param2--){
        final String base = in.nextLine();
        final String sequence = requirement+base+requirement;
        Integer total = 0;
        for(String str : list){
           int length = str.length();
           String temp = str.replaceAll(sequence, "");
           int diff = (length - temp.length()) / (base.length() + 2);
           total += diff;
        }
        sb.append(total.toString()).append("\n");
         
      }
      return sb.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new FindSubstring()).run();
  }
}
