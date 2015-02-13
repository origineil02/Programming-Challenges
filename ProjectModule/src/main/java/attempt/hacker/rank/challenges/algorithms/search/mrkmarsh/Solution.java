package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class MrKMarsh implements Runnable {

    public String solve(final Scanner in) {
      
      final int height = in.nextInt();
      final int width = in.nextInt();
      
      in.nextLine();
      final List<String> field = new ArrayList<>();
      for (int i = height; i > 0; --i) {
        field.add(in.nextLine());
      }
      
      return field.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MrKMarsh()).run();
  }
}
