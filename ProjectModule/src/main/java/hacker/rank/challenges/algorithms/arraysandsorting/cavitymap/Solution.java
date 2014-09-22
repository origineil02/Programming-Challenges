package hacker.rank.challenges.algorithms.arraysandsorting.cavitymap;

import java.util.Scanner;

public class Solution {

  public static class CavityMap implements Runnable {

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      int size = in.nextInt();
      in.nextLine();
      final Integer[][] grid = new Integer[size][size];

      for (int i = 0; i < size; ++i) {
        final char[] line = in.nextLine().toCharArray();
        for (int j = 0; j < size; ++j) {
          grid[i][j] = Integer.parseInt(String.valueOf(line[j]));
        }
      }

      final ViewModel model = new ViewModel(grid);

      for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            sb.append(model.value(i, j));
        }
        sb.append("\n");
      }

      return sb.toString();
    }

    private class ViewModel {

      private final Integer[][] grid;

      ViewModel(Integer[][] grid) {
        this.grid = grid;
      }

      private boolean isBoundary(int i, int j) {
        return i == 0 || j == 0 || j == grid.length - 1 || i == grid.length - 1;
      }

      public String value(int row, int column){
        final Integer value = grid[row][column];
        return isBoundary(row, column) 
                || (value.compareTo(grid[row][column-1]) <= 0
                || value.compareTo(grid[row][column+1]) <= 0
                || value.compareTo(grid[row-1][column]) <= 0
                || value.compareTo(grid[row+1][column]) <= 0)
                ?  value.toString() : "X";
      }
    }
    
  @Override
  public void run() {
    System.out.println(solve(new Scanner(System.in)));
  }
}

public static void main(String[] args){
    new Thread(new CavityMap()).run();
  }
}
