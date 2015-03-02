package attempt.hacker.rank.challenges.algorithms.search.countluck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static class CountLuck implements Runnable {

    private class Coordinate {

      final int row;
      final int column;

      Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
      }

      Coordinate(Coordinate c, Move m) {
        this.row = c.row + m.rowOffset;
        this.column = c.column + m.columnOffset;
      }

      public String toString(){
        return row + " : " + column; 
      }
      
      @Override
      public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.column;
        return hash;
      }

      @Override
      public boolean equals(Object obj) {
        if (obj == null) {
          return false;
        }
        if (getClass() != obj.getClass()) {
          return false;
        }
        final Coordinate other = (Coordinate) obj;
        if (this.row != other.row) {
          return false;
        }
        if (this.column != other.column) {
          return false;
        }
        return true;
      }
    }

    private class Trail {

      final Coordinate c;
      final Integer from;
      final List<Trail> available = new ArrayList<>();
      final List<Trail> explored = new ArrayList<>(); 
      
      Trail(Coordinate c) {
        this.c = c;
        from = 0;
      }

      public Trail from(){
        return explored.get(explored.size()-1);
      }
      
      public boolean isSolvable(Container container){
        
        for (Trail trail : available) {
          if('*' == container.charAt(trail.c)){
            return true;
          }
        }
        return false;
      }
      
      public String toString(){return c + " | " + from;}
    }

    private class Container {

      private final int width;
      private final int height;
      private final List<String> grid;
      private Coordinate location;
      //private int count;

      Container(Scanner in) {
        final String[] params = in.nextLine().split(" ");
        height = Integer.valueOf(params[0]);
        width = Integer.valueOf(params[1]);
        grid = new LinkedList<>();
        for (int i = 0; i < height; i++) {
          final String line = in.nextLine();
          if (line.contains("M")) {
            location = new Coordinate(i, line.indexOf("M"));
          }

          grid.add(line);
        }
      }

      public char charAt(Coordinate c) {
        return grid.get(c.row).charAt(c.column);
      }
    }

    private enum Move {

      UP(-1, 0),
      RIGHT(0, 1),
      DOWN(1, 0),
      LEFT(0, -1);

      private int rowOffset;
      private int columnOffset;

      Move(int rowOffset, int columnOffset) {
        this.rowOffset = rowOffset;
        this.columnOffset = columnOffset;
      }
    }

    private Coordinate next(Coordinate c, Move m, Container container) {
      final Coordinate n = new Coordinate(c, m);
      if (n.row < 0 || n.column < 0
              || n.row >= container.grid.size() || n.column >= container.width
              || 'X' == container.charAt(n)) {
        return null;
      }

      return n;
    }

    private void log(String msg){
      //System.out.println(msg);
    }
    
    private Trail traverse(Trail t, Trail f, Container container) {

      log("@" + t.c + " via " + (null != f ? f.c : "n/a"));
      
      if(!t.available.isEmpty()) {
          t.available.remove(f);
          t.explored.add(f);
      }
      else{
        for (Move m : Move.values()) {
          final Coordinate n = next(t.c, m, container);
          if (null != n){
          
            if(null != f && f.c.equals(n)){
              t.explored.add(f);
            //f.available.remove(f);
            }
            else {
              t.available.add(new Trail(n));
            }
          }
        }

        if(t.isSolvable(container)){
          return t;
        }
      }
      
      if (!t.available.isEmpty()) {
        return traverse(t.available.get(0), t, container);
      }
      else {
        return traverse(f, t, container);
      }
    }

    public String solve(final Scanner in) {
      int testCases = Integer.valueOf(in.nextLine());

      final StringBuilder sb = new StringBuilder();
      while (0 < testCases--) {
        final Container c = new Container(in);
        int expected = Integer.valueOf(in.nextLine());
        Trail t = traverse(new Trail(c.location), null, c);

        int count = 0;
        while (true) {
          if (t.available.size() > 1 || t.explored.size() > (t.c.equals(c.location) ? 0 : 1)) {
            count++;
          }
          
          if(t.c.equals(c.location)){
            break;
          }
          
          t = t.from();
        }
        sb.append(count == expected ? "Impressed" : "Oops!").append("\n");
      }
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new CountLuck()).run();
  }
}
