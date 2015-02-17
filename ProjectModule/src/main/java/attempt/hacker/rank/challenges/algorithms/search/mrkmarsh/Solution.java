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
      
      Dimension(int h, int w){
        this.width = w;
        this.height = h;
      }
    }
    
    private class ResultContainer {
      private int result = -1;
      
      private void setResult(int v){
        result = Math.max(result, v);
      }
    }
    
    private void process(Dimension d, int row, int index, List<String> field, final ResultContainer rc){
      
      final List<String> rows = new ArrayList<>();
      for(int i = row, j = 0; j < d.height; i++, j++) {
        rows.add(field.get(i));
      }
      
      if(row == 1 && index == 1){
        System.out.println("");
      }
      if(rows.isEmpty() || rows.size() == 1){
           return;
        }
      
       log("Process: " + row + " | " + index + " D (w|h): " + d.width + " | " + d.height );
      for(int i = 0; i < rows.size(); i++) {
        final String rowData = rows.get(i).substring(index);
         
        log(rowData);
        
        if(i == rows.size()-1){
          if(rowData.contains("x")){
            if(i == rows.size()-1){
              log("New height: " + (field.size()-field.size()%d.height));
              process(new Dimension(d.height -1, d.width), row, index, field, rc);
            }
            return;
          }
        }
        else{
            int boundary = d.width-1;
            log(" " + boundary);
            final String data = rowData.charAt(0) + "" + rowData.charAt(boundary);
            log(data);
            if(data.contains( "x" )){
             log(" edge fail");
            return;
          }
        }
      }
      
      int result = 2 * (d.width-1) + 2 * (d.height-1);
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
      for(int i = 0; i < field.size()-1; ++i){
        final String row = field.get(i);
        for(int j =0; j < row.length()-1; ++j){
          
          int width = dimensions.width - j;
          while(width > 1){
            process(new Dimension(dimensions.height-i, width), i, j, field, rc);
            width--;
          }
        }
      }
      
      return rc.result < 4 ? "impossible" : String.valueOf(rc.result);
    }

    private void log(String msg){
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
