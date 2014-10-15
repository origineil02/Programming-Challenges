package hacker.rank.challenges.algorithms.search.icecreamparlor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  
  public static class IceCreamParlor implements Runnable {

    public String solve(final Scanner in) {
    final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      
      while(0 < testCases--){
       int cash = in.nextInt();
       int values = in.nextInt();
       
       final Map<Integer, Integer> prices = new HashMap<>();
       for(int i =1; i <= values; ++i){
         int price = in.nextInt();
         int difference = Math.max(price, cash) - Math.min(price, cash);
         if(prices.containsKey(difference) && difference + price == cash){
           int index1 = prices.get(difference);
           int index2 = i;
           sb.append(Math.min(index1, index2))
             .append(" ")
             .append(Math.max(index1, index2))
             .append("\n");
            i = values;
            in.nextLine();
         }
         prices.put(price, i);
       }
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new IceCreamParlor()).run();
  }
}
