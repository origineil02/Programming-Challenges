package hacker.rank.challenges.algorithms.sorting.quicksort.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  public static class Sorting implements Runnable {

    private String format(final String str){
      return str.replace("[", "").replace("]", "").replace(",", "");
    }
    
    private String partition(final Map<Integer, List<Integer>> map, final Integer key){
      return map.get(key).isEmpty()? "" : map.get(key).size()+"\n"+format(map.get(key).toString());
    }
    
    public String solve(final Scanner in) {

      if(!in.hasNext()){return "";}
      
      final int size = in.nextInt();
      Integer pivot = in.nextInt();
      final Map<Integer, List<Integer>> map = new HashMap<>();
      map.put(-1, new ArrayList<Integer>());
      map.put(1, new ArrayList<Integer>());

      for (int i = 0; i < size - 1; ++i) {
        Integer value = in.nextInt();
        int key = pivot.compareTo(value) <= 0 ? 1 : -1;
        map.get(key).add(value);
      }

      final String left = solve(new Scanner(partition(map, -1)));
      final String right = solve(new Scanner(partition(map, 1)));
      
      final String s  =  new StringBuilder()
              .append(left)
              .append(" ")
              .append(pivot)
              .append(" ")
              .append(right)
              .toString().trim();
      
      if(s.contains(" ")){
        System.out.println(s);
      }
      return s;
    }

    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new Sorting()).run();
  }
}
