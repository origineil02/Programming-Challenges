package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class MrKMarsh implements Runnable {

         //  return 2 * (W - E) + 2 * (S - N);
    private class ResultContainer {

      private int result = -1;

      private void setResult(int v) {
        result = Math.max(result, v);
      }
    }

    private List<String> sublistHead(List<String> l){
      final List<String> n = new ArrayList<>(l);
      n.remove(0);
      return n;
    }
    
    private String handle(int pos, int index, List<String> field) {
      String str = index == 0 ? field.remove(pos) : field.remove(pos).substring(index);
      return str;
    }

    private boolean hasEdgeError(int index, int w, List<String> field){
      if(field.isEmpty()){return false;}
      
      for (String tmp : field) {
        String str = tmp.substring(index);
        if(str.charAt(0) == 'x' || str.charAt(w-1) == 'x'){
          log("edge error");
          return true;
        }
                
      }
      return false;
    }
    
    private void process(int index, int w, List<String> field, final ResultContainer rc) {
      
      if(field.size() < 2 || w < 2){return;}
      
      final List<String> n = new ArrayList<>(field);
      String first = handle(0, index, n);
      String last = handle(n.size() - 1, index, n);

      //log("rows: " + field.size());

      if(first.length() < 2){return;}
      
      log("Process f: " + index + " " + w + " within " + first);
      log("Process l: " + index + " " + w + " within " + last);
      
//      log(first.substring(0, w));
//      for (String str : n) {
//        String tmp = str.substring(index);
//        log(tmp.charAt(0) + " " + tmp.charAt(w-1));
//      }
//      log(last.substring(0, w));
      
      if (first.substring(0, w).contains("x") || last.substring(0, w).contains("x")
              || hasEdgeError(index, w, n)) {
        process(index+1, first.length()-1, field, rc);
        process(index, w-1, field, rc);
        if(field.size() > 2){
          process(index, w, sublistHead(field), rc);
          process(index, w, field.subList(0, field.size()-1), rc);
        }
        return;
      }


      int result = 2 * w + (2 * (field.size()-2) );
      log("Result: " + result);
      rc.setResult(result);

    }

    public String solve(final Scanner in) {

      final String[] parameters = in.nextLine().split(" ");
      //final Dimension dimensions = new Dimension(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]));

      final List<String> field = new ArrayList<>();
      for (int i = Integer.parseInt(parameters[0]); i > 0; --i) {
        final String row = in.nextLine();
        log(row);
        field.add(row);
      }

      final ResultContainer rc = new ResultContainer();
      process(0, Integer.parseInt(parameters[1]), field, rc);

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
