package attempt.hacker.rank.challenges.algorithms.summationandalgebra.trianglenumbers;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
  /*
  
        1  3  6  7
      1 4  10 16
    1 5 15 30
  1 6 21
1 7 28 
  */
  public static class TriangleNumbers implements Runnable {

    private int getData(int target){
      
      if(1 == target || 2 == target){return -1;}
      
      final LinkedList<Integer> row = new LinkedList();
      row.add(1);
      row.add(target-1);
      
      final LinkedList<Integer> previous = new LinkedList();
      previous.add(0);
      previous.add(1);
      previous.add(target-2); //wrong
      
      int length = target%2==0 ? target+1 : target;
       
      for(int i = 1; i < length; ++i){
        
        int value = previous.get(i) + previous.get(i-1) + previous.get(i+1);
        previous.add(value); //wrong
        row.add(value);
        
        if(value%2==0){ System.out.println("--" + target + "--\n" +previous + "\n" + row + "\n-----\n");return i+1;}
      }
      return -1;
    }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      
      int testCases = in.nextInt();
      while(0 < testCases--){
        int row = in.nextInt();
        sb.append(getData(row)).append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new TriangleNumbers()).run();
  }
}
