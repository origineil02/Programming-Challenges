package hacker.rank.algorithms.combinatronics.buildingalist;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  
  public static class BuildingAList implements Runnable {

    void solve(String base, int index, char[] c, Set<String> strs){
      
      if(c.length <= index){return;}

      for (int i = index; i < c.length; i++) {
        final char[] temp =  (base + c[i]).toCharArray();
        Arrays.sort(temp);
        strs.add(String.valueOf(temp));
        solve(base+c[i], i+1, c, strs);
      }
    }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      while(0<testCases--){
        in.nextLine();
        final Set<String> s = new TreeSet<>();
        final String line = in.nextLine();

        solve("", 0, line.toCharArray(), s);

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
