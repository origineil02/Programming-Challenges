package hacker.rank.challenges.algorithms.arraysandsorting.countingsort.part3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
  
  public static class CountingSortPart3 implements Runnable {

    public String solve(final Scanner in) {
      
      final int size = in.nextInt();
      in.nextLine();
      
      final Map<Integer, Integer> map = new TreeMap<>();
      for(int i = 0; i < size; ++i){
        
        final int key = Integer.parseInt(in.nextLine().split("\\s")[0]);
        if(!map.containsKey(key)){
          map.put(key, 0);
        }
        map.put(key, map.get(key)+1);
      }
      
      final StringBuilder sb = new StringBuilder();
      
      int tally = 0;
      for(int i = 0; i <= 99; ++i){
        
        if(!map.containsKey(i)){
          map.put(i, tally);
        }
        else {
          tally += map.get(i);
        }
        
        sb.append(tally).append(" ");
      }
      
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new CountingSortPart3()).run();
  }
}
