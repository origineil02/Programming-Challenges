package attempt.hacker.rank.challenges.algorithms.search.gridsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class GridSearch implements Runnable {

    private class Container {

      private final int width;
      private final int height;
      private final List<String> grid;

      Container(Scanner in) {

        final String[] params = in.nextLine().split(" ");
        height = Integer.valueOf(params[0]);
        width = Integer.valueOf(params[1]);
        grid = new LinkedList<>();

        for (int i = 0; i < height; i++) {
          grid.add(in.nextLine());
        }
      }
    }

    private boolean isAMatch(List<String> grid, List<String> pattern, int column, int row) {
      
      if(row + pattern.size() > grid.size()){return false;}
      
      for (int i = 0; i < pattern.size(); i++) {

        final String target = pattern.get(i);
        final String rowData = grid.get(row + i).substring(column);
        if(target.length() > rowData.length()){return false;}
        
        for (int j = 0; j < target.length(); j++) {
          if (rowData.charAt(j) != target.charAt(j)) {
            return false;
          }
        }
      }
      return true;
    }

    private List<Integer> getIndices(List<String> grid, char target, int row) {
      final String rowData = grid.get(row);
      final List<Integer> indices = new ArrayList<>();
      for (int j = 0; j < rowData.length(); j++) {
        if (rowData.charAt(j) == target) {
          indices.add(j);
        }
      }
      return indices;
    }

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());

      while (0 < testCases--) {
        final Container container = new Container(in);
        final Container pattern = new Container(in);

        boolean flag = false;
        for (int i = 0; i < container.width; i++) {
          for (Integer index : getIndices(container.grid, pattern.grid.get(0).charAt(0), i)) {
            flag |= isAMatch(container.grid, pattern.grid, index, i);
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

  public static void main(String[] args) {
    new Thread(new GridSearch()).run();
  }
}
