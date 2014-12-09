package attempt.hacker.rank.algorithms.combinatronics.buildingalist;

import java.util.Scanner;

public class Solution {
  
  public static class BuildingAList implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      while(0<testCases--){
        in.nextLine();
        char[] line = in.nextLine().toCharArray();
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new BuildingAList()).run();
  }
}
