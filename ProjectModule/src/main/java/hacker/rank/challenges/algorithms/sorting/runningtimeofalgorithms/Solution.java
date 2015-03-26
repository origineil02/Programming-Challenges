package hacker.rank.challenges.algorithms.sorting.runningtimeofalgorithms;

import java.util.Scanner;

public class Solution {
  
  public static class RunningTimeOfAlgorithms implements Runnable {

    public String solve(final Scanner in) {
      
      in.nextLine();
      
      int swaps = 0;
      final String[] data = in.nextLine().split("\\s");
      
      int index = 1;
      while(index < data.length){
        int i = index;
        while(i != 0 && Integer.parseInt(data[i]) < Integer.parseInt(data[i-1])){
          String temp = data[i];
          data[i] = data[i-1];
          data[i-1] = temp;
          --i;
          ++swaps;
        }
        index++;
      }
      return String.valueOf(swaps);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new RunningTimeOfAlgorithms()).run();
  }
}
