package hacker.rank.challenges.algorithms.implementation.cuttheststicks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
  
  public static class CutTheSticks implements Runnable {

    public String solve(final Scanner in) {
      int sticks = in.nextInt();
      final Map<Integer, List<Integer>> data = new TreeMap<>();
      for(int i = 0; i < sticks; ++i){
        
        final Integer input = in.nextInt();
        if(!data.containsKey(input)){
          data.put(input, new ArrayList<Integer>());
        }
        data.get(input).add(input);
      }
      
      final StringBuilder sb = new StringBuilder();

      while(!data.isEmpty()){
        int cut = data.keySet().iterator().next();
        int tokens = data.get(cut).size();
        sb.append(sticks).append("\n");
        sticks -= tokens;
        data.remove(cut);
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new CutTheSticks()).run();
  }
}
