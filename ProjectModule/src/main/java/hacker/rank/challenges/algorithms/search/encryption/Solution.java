package hacker.rank.challenges.algorithms.search.encryption;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  public static class Encryption implements Runnable {

    private void debug(final String line){
      System.out.println(line);
      final StringBuilder sb = new StringBuilder();
      final StringBuilder two = new StringBuilder();
      for (int i = 0; i < line.length(); i++) {
        sb.append(i).append(" ");
        two.append(line.charAt(i)).append(" ");
      }
      System.out.println(sb.toString());
      System.out.println(two.toString());
    }
    
    private String[] square(final String line, int rows, int columns){
      final StringBuilder sb = new StringBuilder();
      
      for(int i = 0; i < line.length(); ++i) {
        sb.append(line.charAt(i));
        if((i+1) % columns == 0)
          sb.append("\n");
      }
      return sb.toString().split("\n");
    }
    
    public String solve(final Scanner in) {

      final String line = in.nextLine().replace(" ", "");
      
      debug(line); 
      
      final double sqrt = Math.sqrt(line.length());
      final Double floor = Math.floor(sqrt);
      final Double ceil = Math.ceil(sqrt);
      
      final int rows = Math.min(floor.intValue(), ceil.intValue());
      final int columns = Math.max(floor.intValue(), ceil.intValue());
      
      final String[] square = square(line, rows, columns);
      System.out.println(Arrays.toString(square));
      
      final StringBuilder sb = new StringBuilder();
      
      int index = 0;
      for(int i = 0; i < columns; ++i){
         for(String str : square){
           sb.append(str.length() > index ? str.charAt(index) : "");
         }
         index++;
         sb.append(" ");
      }
      return sb.toString().trim();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new Encryption()).run();
  }
}
