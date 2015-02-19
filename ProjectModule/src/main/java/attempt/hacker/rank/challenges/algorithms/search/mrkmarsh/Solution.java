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

    private String getScopedData(int index, int width, final String data){
      
      if(index == 0 && width == data.length()-1){
        return data;
      }
      
      final StringBuilder sb = new StringBuilder();
        for (int j = index, k = 0; k < width; ++j, ++k) {
          sb.append(data.charAt(j));
        }
        return  sb.toString();
    }
    
    private void process(Dimension d, int row, int index, List<String> field, final ResultContainer rc) {

      if (d.height < 2 || d.width < 2) {
        return;
      }
      
      if(rc.result > 0){
        int potential = 2 * (d.width - 1) + 2 * (d.height - 1);
        if(potential < rc.result){
          return;
        }
      }

      final List<String> rows = new ArrayList<>();
      for (int i = row, j = 0; j < d.height; i++, j++) {
        rows.add(field.get(i));
      }

      log("Process: " + row + " | " + index + " D (w|h): " + d.width + " | " + d.height);

      for (int i = 0; i < rows.size(); i++) {

        String rowData = getScopedData(index, d.width, rows.get(i));

        if (rowData.length() < 2) {
          return;
        }

        log(rowData + " row " + (i+1) + " out of " + rows.size());

        final String data = rowData.charAt(0) + "" + rowData.charAt(rowData.length() - 1);
        if (i == 0 || i == rows.size() - 1) {
          if (rowData.contains("x")) {
            if (i == rows.size() - 1) {
              process(new Dimension(d.height - 1, d.width), row, index, field, rc);
            } //else if (rowData.charAt(rowData.length() - 1) == 'x') {
              process(new Dimension(d.height, d.width - 1), row, index, field, rc);
            //}
            return;
          }
        }
        else {
          
          if (data.contains("x")) {
            log(" edge fail");
            process(new Dimension(d.height, d.width - 1), row, index, field, rc);
            if(i < rows.size()-1 && i > 1){
              final String previous = getScopedData(index, d.width, rows.get(i-1));
              if(!previous.contains("x")){
                int result = 2 * (d.width - 1) + 2 * (i-1);
                log("Result: " + result);
                rc.setResult(result);
              }
              //  process(new Dimension(d.height-1, d.width), row, index, field, rc);
            }
            
            return;
          }
        }
      }

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
          process(new Dimension(dimensions.height - i, dimensions.width - j), i, j, field, rc);
        }
      }

      return rc.result < 4 ? "impossible" : String.valueOf(rc.result);
    }

    private void log(String msg) {
      //System.out.println(msg);
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
