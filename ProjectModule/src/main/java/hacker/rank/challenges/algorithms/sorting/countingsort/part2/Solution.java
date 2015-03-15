package hacker.rank.challenges.algorithms.sorting.countingsort.part2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
  
  public static class CountingSortPart2 implements Runnable {

    public String solve(final Scanner in) {
      
      final int size = in.nextInt();
      in.nextLine();
      
      final Map<Integer, Integer> map = new TreeMap<>();
      for(int i = 0; i < size; ++i){
        
        final int key = in.nextInt();
        if(!map.containsKey(key)){
          map.put(key, 0);
        }
        map.put(key, map.get(key)+1);
      }
      
      final StringBuilder sb = new StringBuilder();
      
      for(Entry<Integer, Integer> entry : map.entrySet()){
        for(int i = entry.getValue(); i > 0; --i){
          sb.append(entry.getKey()).append(" ");
        }
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new CountingSortPart2()).run();
  }
}
