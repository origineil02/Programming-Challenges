package hacker.rank.challenges.algorithms.sorting.thefullcountingsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

  public static class FullCountingSort implements Runnable {

    public String solve(final Scanner in) {

      final int size = in.nextInt();
      in.nextLine();

      final Map<Integer, List<String>> map = new TreeMap<>();
      
      for (int i = 0; i < size; ++i) {
        
        final Integer number = in.nextInt();
        final String string = in.nextLine().trim();
        
        if (!map.containsKey(number)) {
          map.put(number, new ArrayList<String>());
        }
        map.get(number).add(i < size/2 ? "-" : string);
      }

      final StringBuilder sb = new StringBuilder();
      for (Entry<Integer, List<String>> entry : map.entrySet()) {
        for (String str : entry.getValue()) {
          sb.append(str).append(" ");
        }
      }
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new FullCountingSort()).run();
  }
}
