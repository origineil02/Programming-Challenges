package attempt.hacker.rank.algorithms.combinatronics.buildingalist;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  
  public static class BuildingAList implements Runnable {

    void solve(int index, char[] c, Set<String> strs){
      
      if(c.length <= index){return;}
      String s = ""+c[index];
      strs.add(s);
      for (int i = index+1; i < c.length; i++) {
        strs.add(s+c[i]);
        for (int j = index-1; j > 0; j--) {
            strs.add(s+c[i]+c[j]);
          }
        }
      
      solve(++index, c, strs);
    }
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      while(0<testCases--){
        in.nextLine();
        final Set<String> s = new TreeSet<>();
        final String line = in.nextLine();
        s.add(line);
        solve(0, line.toCharArray(), s);
        sb.append(s.toString().replace("[", "").replace("]", "").replace(", ", "\n"));
        sb.append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new BuildingAList()).run();
  }
}
