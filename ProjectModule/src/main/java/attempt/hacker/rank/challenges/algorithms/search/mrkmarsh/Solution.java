package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class MrKMarsh implements Runnable {

    //  return 2 * (W - E) + 2 * (S - N);
    private class Dimension {

      final int width;
      final int height;

      Dimension(int h, int w) {
        this.width = w;
        this.height = h;
      }
    }

    private class ResultContainer {

      private int result = -1;

      private void setResult(int v) {
        result = Math.max(result, v);
      }
    }
    
    private String getData(Dimension d, int row, int index, List<String> field){
        final String rowData = field.get(row);
        return rowData.substring(index).substring(0, d.width + 1);
    }
    
    private void process(Dimension d, int row, int index, List<String> field, final ResultContainer rc) {

      //log("-begin-");
      
      if(d.width > field.get(row).length()-1){ return; }
      if(d.height > field.size()) { return; }
      
      final String first = getData(d, row, index, field);
      log(first);
      
      if(!first.contains("x")){
        process(new Dimension(d.height, d.width+1), row, index, field, rc);
      }
         
      log("----");
      for (int i = 1; i < d.height; i++) {
        final String next = getData(d, row+i, index, field);
        log(next);
        
        if(next.contains("x") && i == d.height){
          if(next.charAt(0) != 'x' && next.charAt(next.length()-1) != 'x'){
            process(new Dimension(d.height+1, d.width), row, index, field, rc);
          }
          return;
        }else if(d.height < field.size()){
          process(new Dimension(d.height+1, d.width), row, index, field, rc);
        }
      }
      
      log("----");
      int result = 2 * (d.width - 1) + 2 * (d.height - 1);
      log("Result: " + result);
      rc.setResult(result);
    }

    public String solve(final Scanner in) {

      final String[] parameters = in.nextLine().split(" ");
      final Dimension dimensions = new Dimension(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]));

      final List<String> field = new ArrayList<>();
      for (int i = dimensions.height; i > 0; --i) {
        final String row = in.nextLine();
        log(row);
        field.add(row);
      }

      final ResultContainer rc = new ResultContainer();
      for (int i = 0; i < field.size() - 1; ++i) {
        final String row = field.get(i);
        for (int j = 0; j < row.length() - 1; ++j) {
          process(new Dimension(1, 1), i, j, field, rc);
        }
      }

      return rc.result < 4 ? "impossible" : String.valueOf(rc.result);
    }

    private void log(String msg) {
      System.out.println(msg);
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new MrKMarsh()).run();
  }
}
