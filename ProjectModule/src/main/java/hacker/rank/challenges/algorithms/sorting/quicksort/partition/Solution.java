package hacker.rank.challenges.algorithms.sorting.quicksort.partition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  
  public static class Partition implements Runnable {

    private String format(final String str){
      return str.replace("[", "").replace("]", "").replace(",", "");
    }
    
    public String solve(final Scanner in) {
      
      final int size = in.nextInt();
      Integer pivot = in.nextInt();
      final Map<Integer, List<Integer>> map = new HashMap<>();
      map.put(-1, new ArrayList<Integer>());
      map.put(1, new ArrayList<Integer>());
      
      for(int i = 0; i < size-1; ++i){
        Integer value = in.nextInt();
        int key = pivot.compareTo(value)<=0 ? 1 : -1;
        map.get(key).add(value);
      }
      
      return new StringBuilder()
              .append(format(map.get(-1).toString()))
              .append(" ")
              .append(pivot)
              .append(" ")
              .append(format(map.get(1).toString()))
              .toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new Partition()).run();
  }
}
