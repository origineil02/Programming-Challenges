package hacker.rank.challenges.algorithms.warmup.sherlockandgcd;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

  public static class SherlockAndGCD implements Runnable {

  private long gcd(long a, long b) {
    long max = Math.max(a, b);
    long min = Math.min(a, b);

    while (min != 0) {
      long t = min;
      min = max % min;
      max = t;
    }
    return max;
  } 
    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();

      int testCases = Integer.parseInt(in.nextLine());
      while (0 < testCases--) {
        int size = Integer.parseInt(in.nextLine());
        final String[] line = size == 1 ? new String[]{in.nextLine()} : in.nextLine().split(" ");

        final Set<Integer> data = new TreeSet<>();

        boolean flag = false;
        for (String str : line) {
          final Integer value = Integer.parseInt(str);
          
          for(Integer i : data){
            if(1 == gcd(value, i)){
              flag = true;
              break;
            }
          }
          data.add(value);
           
          if(flag){break;}
        }

        sb.append(flag ? "YES" : "NO").append("\n");
      }
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new SherlockAndGCD()).run();
  }
}
