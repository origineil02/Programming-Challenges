package hacker.rank.challenges.algorithms.arraysandsorting.sherlockandwatson;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
  
  public static class SherlockAndWatson implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      
      final int n = in.nextInt();
      int k = in.nextInt();
      final int q = in.nextInt();
       
      final LinkedList<Integer> list = new LinkedList<>();
      
      for(int i = n; i > 0; --i){
        list.add(in.nextInt());
      }
       
      while(k >= n) {
        k -= n;
      }
      
      for(int i = k; i > 0; --i){
        list.addFirst(list.removeLast());
      }
      
      for(int i = q; i > 0; --i){
        int index = in.nextInt();
        sb.append(list.get(index)).append("\n");
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndWatson()).run();
  }
}
