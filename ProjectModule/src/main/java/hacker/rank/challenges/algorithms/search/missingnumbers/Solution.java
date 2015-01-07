package hacker.rank.challenges.algorithms.search.missingnumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  
  public static class MissingNumbers implements Runnable {

    private Map<Integer, List<Integer>>readData(final Scanner in){
      
      final Map<Integer, List<Integer>> data = new HashMap<>();
      int length = in.nextInt();
      
      for (int i = 0; i < length; i++) {
        Integer key = in.nextInt();
        
        if(!data.containsKey(key))
        {
          data.put(key, new ArrayList<Integer>());
        }
        data.get(key).add(1);
      }
      return data;
    }
    
    public String solve(final Scanner in) {
      
     final Map<Integer, List<Integer>> one = readData(in);
     final Map<Integer, List<Integer>> two = readData(in);
     
     final Set<Integer> output = new TreeSet<>();
      for (Map.Entry<Integer, List<Integer>> entry : two.entrySet()) {
         if(one.containsKey(entry.getKey())){
           if(one.get(entry.getKey()).size() != entry.getValue().size()){
             output.add(entry.getKey());
           }
         }
         else
         {
           output.add(entry.getKey());
         }
      }
      
      return output.toString().replace("]", "").replace("[", "").replace(",", "");
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MissingNumbers()).run();
  }
}
