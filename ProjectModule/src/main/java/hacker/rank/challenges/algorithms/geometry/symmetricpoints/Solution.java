package hacker.rank.challenges.algorithms.geometry.symmetricpoints;

import java.util.Scanner;

public class Solution {

  public static class SymmetricPoints implements Runnable {

    @Override
    public void run() {
      final Scanner in = new Scanner(System.in);
      int terminator = in.nextInt();
      for (int i = 0; i < terminator; ++i) {

        final Coordinate p = new Coordinate(in.nextInt(), in.nextInt());
        final Coordinate q = new Coordinate(in.nextInt(), in.nextInt());
        
        System.out.println(new Coordinate(q.x + (q.x - p.x), q.y + (q.y - p.y)));
      }
    }

    private class Coordinate {

      final int x;
      final int y;

      public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
      }

      @Override
      public String toString() {
        return  x + " " + y;
      }
    }
  }

  public static void main(String[] args) {
    new Thread(new SymmetricPoints()).run();
  }
}
