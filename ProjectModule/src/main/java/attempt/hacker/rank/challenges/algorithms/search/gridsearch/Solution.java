package attempt.hacker.rank.challenges.algorithms.search.gridsearch;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class GridSearch implements Runnable {

    private List<String> getGrid(Scanner in){
      final int h = Integer.parseInt(in.nextLine().split(" ")[0]);
      final List<String> data = new LinkedList<>();
      
      for (int i = 0; i < h; i++) {
        data.add(in.nextLine());
      }
      
      return data;
    }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      
      while(0 < testCases--) {
        final List<String> grid = getGrid(in);
        final List<String> pattern = getGrid(in);
      
        boolean flag = true;
        for (int i =0; i<grid.size(); i++) {
          int indexOf = grid.get(i).indexOf(pattern.get(0));
          if(0 < indexOf){
            for (int j = 1; j+i < grid.size() && j < pattern.size(); j++) {
              int index = grid.get(j+i).indexOf(pattern.get(j));
              flag &= index == indexOf;
            }
          }
        }
        sb.append(flag ? "YES" : "NO").append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new GridSearch()).run();
  }
}
