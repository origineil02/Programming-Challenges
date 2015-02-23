package hacker.rank.challenges.algorithms.search.pairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  
  public static class Pairs implements Runnable {

    private class Container{
      private int count = 0;
      public void increment(){
       count++; 
      }
      
      public int getCount(){
        return count;
      }
    }
    
    public String solve(final Scanner in) {
      
      int numbers = in.nextInt();
      final int difference = in.nextInt();
      
      final Map<Integer, Container> map = new HashMap<>();
      
      int sum = 0;
      while (0 < numbers--) {
        final int number = in.nextInt();
        final Integer[] keys = new Integer[]{number+difference, number-difference};
        
        for (Integer key : keys) {
          if(key <= 0){continue;}
          
          if(map.containsKey(key)){
            sum += map.get(key).getCount();
          }
        }
        
        if(!map.containsKey(number)){
          map.put(number, new Container());
        }
        
        map.get(number).increment();
      }
      return "" + sum;
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new Pairs()).run();
  }
}
