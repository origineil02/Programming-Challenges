package hacker.rank.challenges.misc.regex.spellingstyle.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class SpellingStylePart2 implements Runnable {

    public String solve(final Scanner in) {
      
      final int lineCount = in.nextInt();
      in.nextLine();
      
      final List<List<String>> lines = new ArrayList<>();
      for(int i = 0; i < lineCount; ++i){
        lines.add(Arrays.asList(in.nextLine().split(" ")));
      }
      
      final StringBuilder sb = new StringBuilder();
      final int tokenCount = in.nextInt();
      in.nextLine();
      
      
      for(int i=0; i<tokenCount; ++i){
        int count = 0;
        final String token = in.nextLine();
        final String regex = token.replace("our", "(or|our)");
        
        for (List<String> container : lines) {
          for (String str : container) {
            if(str.matches(regex)){++count;}
          }
        }
        sb.append(count).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SpellingStylePart2()).run();
  }
}
