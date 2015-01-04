package attempt.hacker.rank.challenges.algorithms.geometry.sherlockandplanes;

import java.util.Scanner;

public class Solution {
  
  public static class SherlockAndPlanes implements Runnable {

    public String solve(final Scanner in) {
      
      int testCases = Integer.parseInt(in.nextLine());
      boolean samePlane = false;
      
      String[][] coordinates = new String[4][];
      while(0 < testCases--){
        for(int i = 0; i < 4; i++){
          coordinates[i] = in.nextLine().split(" ");
        }
      }
      
      String zAxis = "";
      for (String[] str : coordinates) {
        zAxis = str[2];
      }
      
      if(zAxis.replace(""+zAxis.charAt(0), "").length() == 0){
        samePlane = true;
      }
      
      return samePlane ? "YES" : "NO";
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndPlanes()).run();
  }
}
