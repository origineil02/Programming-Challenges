package hacker.rank.challenges.algorithms.arraysandsorting.countingsort.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  
  public static class CountingSortPart1 implements Runnable {

    public String solve(final Scanner in) {
      
      final int size = in.nextInt();
      in.nextLine();
      
      final Map<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < size; ++i){
        
        final int key = in.nextInt();
        if(!map.containsKey(key)){
          map.put(key, 0);
        }
        map.put(key, map.get(key)+1);
      }
      
      final StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < 100; ++i){
        sb.append(map.containsKey(i) ? map.get(i) : "0")
                .append(i < 99 ? " " : "");
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new CountingSortPart1()).run();
  }
}
