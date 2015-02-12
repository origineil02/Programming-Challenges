package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandsquares;

import java.util.Scanner;

public class Solution {

  public static class SherlockAndSquares implements Runnable {

    private boolean isSquare(int v) {
      final Double d = Math.sqrt(v);
      return (d.intValue() * d.intValue() == v);
    }

    private int sqrt(int v) {
      final Double d = Math.sqrt(v);
      return d.intValue();
    }

    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();

      while (0 < testCases--) {
        int begin = in.nextInt();
        int bc = begin;

        int end = in.nextInt();
        int ec = end;

        if (isSquare(begin) && begin != 1) {
          --begin;
          while (!isSquare(begin)) {
            --begin;
          }
        }
        else {
          while (!isSquare(begin++)) {
          }
        }

        if (isSquare(end)) {
          end++;
          while (!isSquare(end)) {
            end++;
          }
        }
        else {
          while (!isSquare(end)) {
            end--;
          }
        }

        //int offset = bc == 1 ? 1 : bc == begin ? 1 : 0; 
        int result = end < begin ? 0 : sqrt(end) - sqrt(begin);

        sb.append(result).append("\n");
      }

      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new SherlockAndSquares()).run();
  }
}
