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

    private String handle(int pos, int index, List<String> field) {
      String str = index == 0 ? field.get(pos) : field.get(pos).substring(index);
      return str;
    }

    private void process(int index, int w, List<String> field, final ResultContainer rc) {
      
      if(field.size() < 2 || w < 2){return;}
      
      System.out.println("--");
      for (String str : field) {
        System.out.println(str);
      }
      System.out.println("--");
      
      String first = handle(0, index, field);
      String last = handle(field.size() - 1, index, field);

      //log("rows: " + field.size());

      if(first.length() < 2){return;}
      
      log("Process f: " + index + " " + w + " within " + first);
      log("Process l: " + index + " " + w + " within " + last);
      
      if (first.substring(0, w - 1).contains("x")) {
        process(index+1, first.length()-1, field, rc);
        //process(index, w-1, field, rc);
        process(index, first.length(), field.subList(1, field.size()), rc);
      }

      if (last.substring(0, w - 1).contains("x")) {
        process(index, w, field.subList(0, field.size() - 1), rc);
        process(index+1, last.length(), field, rc);
      }

      for (String str : field) {
        String tmp  = str.substring(index);
        //log(" " + boundary);
        if(w-1 >= tmp.length()){return;}
        System.out.println("w: " + (w-1) + " in " + tmp.length() );
        final String data = field.size() == 2 ? tmp.substring(0, Math.min(tmp.length()-1, w)) : tmp.charAt(0) + "" + tmp.charAt(w-1);
        log(data);
        if (data.contains("x")) {
          int ip = field.indexOf(str);
          if( field.size() > 2 && (ip == 0 || ip == field.size()-1)){
            final List<String> copy = new ArrayList<>(field);
            copy.remove(str);
            process(index, w, copy, rc);
          }
          else{
            process(index, w-1, field, rc);
          }
          return;
        }
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
