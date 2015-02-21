package hacker.rank.challenges.algorithms.search.mrkmarsh;

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
        
        String tmp = "";
        for (int i = index, j=0; j <= d.width; j++) {
          {
            tmp += rowData.charAt(i+j);
          }
        }
        return tmp;
    }
    private void calculate(final Dimension d, final ResultContainer rc){
      int result = 2 * (d.width + 1) + 2 * (d.height+1) - 4;
      log("Result: " + result);
      rc.setResult(result);
    }
    
    private void process(Dimension d, int row, int index, List<String> field, final ResultContainer rc) {

      log(row + " | " + index);
      
      if(d.width + index > field.get(row).length()-1){ return; }
      if(d.height + row >= field.size()) { return; }
      
      final String first = getData(d, row, index, field);
      
      log(first);
      
      if(!first.contains("x")){
        process(new Dimension(d.height, d.width+1), row, index, field, rc);
      }
      else{
        return;
      }
         
      log("--body--");
       
      String next = getData(d, row+d.height, index, field);
      log(next);
             
       int count = 1;
        while(next.charAt(0) != 'x' && next.charAt(next.length()-1) != 'x'){
          if(row+d.height+count == field.size()){
            break;
          }
          
          if(!next.contains("x")){calculate(new Dimension(d.height+count-1, d.width), rc);}
          
          next = getData(d, row+d.height+(count++), index, field);
          log(next);
        }
        
        if(next.contains("x")){return;}
      
      log("--end--");
      calculate(new Dimension(d.height+count-1, d.width), rc);
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
