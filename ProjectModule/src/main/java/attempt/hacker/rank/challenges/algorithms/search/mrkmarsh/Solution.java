package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class MrKMarsh implements Runnable {

     //  return 2 * (W - E) + 2 * (S - N);

    public String solve(final Scanner in) {

      final String[] dimensions = in.nextLine().split(" ");
      
      final FieldBuilder fb = new FieldBuilder()
              .height(Integer.parseInt(dimensions[0]))
              .width(Integer.parseInt(dimensions[1]));
      
      
      final List<String> field = new ArrayList<>();
      for (int i = Integer.parseInt(dimensions[0]); i > 0; --i) {
        fb.row(in.nextLine());
      }
 
      final Field f = fb.build();
      return f.rows.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }

    public class FieldBuilder {

      private final Field f = new Field();
      public FieldBuilder height(int h){
        f.height = h;
        return this;
      }
      
      public FieldBuilder width(int w){
        f.width = w;
        return this;
      }
      
      public FieldBuilder row(String row){
        
        final LinkedList l = new LinkedList();
        
        for (char c : row.toCharArray()) {
          l.add(c);
        }
        
        f.rows.add(l);
        
        return this;
      }
      
      public Field build() {
        return f;
      }
    }
    
    public class Field {

      private int height;
      private int width;
      private List<LinkedList> rows = new ArrayList();;
      
      private Field() {
        
      }
    }
  }

  public static void main(String[] args) {
    new Thread(new MrKMarsh()).run();
  }
}
