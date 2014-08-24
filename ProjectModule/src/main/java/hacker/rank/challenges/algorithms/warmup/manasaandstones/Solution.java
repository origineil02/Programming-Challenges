package hacker.rank.challenges.algorithms.warmup.manasaandstones;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  
  public static class MasanaAndStones implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      
      for(int testCases = in.nextInt(); testCases > 0; --testCases){
        Set<Integer> values = new TreeSet<>();
        int stones = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        values.add(a);
        values.add(b);
        
        for(int j = 2; j < stones; ++j)
        {
          Set<Integer> local = new TreeSet<>();
          for(Integer value : values){
            local.add(value + a);
            local.add(value + b);
          }
           values = local;
        }
        
      final String answer = values.toString().replace("[", "").replace("]", "").replace(",", "");
        
      System.out.println(answer);
      sb.append(answer)
        .append("\n");
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MasanaAndStones()).run();
  }
}
