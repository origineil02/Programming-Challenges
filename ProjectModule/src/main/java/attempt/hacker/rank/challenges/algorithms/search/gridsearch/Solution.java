package attempt.hacker.rank.challenges.algorithms.search.gridsearch;

import java.util.ArrayList;
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
    
    private boolean isAMatch(List<String> grid, List<String> pattern, int column, int row){
      for (int i = 0; i < pattern.size(); i++) {
        if(i+row >= grid.size()){return false;}
        
       
        final String target = pattern.get(i);
         if(column+target.length() >= grid.size()){return false;}
         
        final String rowData = grid.get(row+i);
        for (int j = 0; j < target.length() ; j++) {
          if(rowData.charAt(column+j) != target.charAt(j)){
            return false;
          }
        }
      }
      return true;
    }
    
    private List<Integer> getIndices(List<String> grid, char target, int row){
      final String rowData = grid.get(row);
      final List<Integer> indices = new ArrayList<>();
      for (int j = 0; j < rowData.length(); j++) {
        if(rowData.charAt(j) == target){
          indices.add(j);
        }
      }
      return indices;
    }
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      
      while(0 < testCases--) {
        final List<String> grid = getGrid(in);
        final List<String> pattern = getGrid(in);
      
        boolean flag = false;
        for (int i =0; i<grid.size(); i++) {
            for(Integer index : getIndices(grid, pattern.get(0).charAt(0), i)){
              flag |= isAMatch(grid, pattern, index, i);
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
