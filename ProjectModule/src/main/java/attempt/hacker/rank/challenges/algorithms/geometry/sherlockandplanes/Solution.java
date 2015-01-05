package attempt.hacker.rank.challenges.algorithms.geometry.sherlockandplanes;

import java.util.Scanner;

public class Solution {
  
  public static class SherlockAndPlanes implements Runnable {

    private boolean checkPlane(int plane, String[][] coordinates){
      String axis = "";
      for (String[] str : coordinates) {
        axis = str[plane];
      }
      
     return axis.replace(""+axis.charAt(0), "").length() == 0;
    }
    
    public String solve(final Scanner in) {
      
      int testCases = Integer.parseInt(in.nextLine());
      final StringBuilder sb = new StringBuilder();
      final String[][] coordinates = new String[4][];
      while(0 < testCases--){
        for(int i = 0; i < 4; i++){
          coordinates[i] = in.nextLine().split(" ");
        }
        
        boolean matchingAxis = checkPlane(0, coordinates) || checkPlane(1, coordinates) || checkPlane(2, coordinates);
        sb.append(matchingAxis ? "YES" : "NO").append("\n");
      }
      
      return sb.toString().trim();
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
