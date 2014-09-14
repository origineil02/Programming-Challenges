package hacker.rank.challenges.algorithms.arraysandsorting.insertionsort.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  
  public static class InsertionSortPart2 implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      final int size = in.nextInt();
      in.nextLine();
      
      final String[] data = in.nextLine().split("\\s");
      
      int index = 1;
      while(index < size){
        int i = index;
        while(i != 0 && Integer.parseInt(data[i]) < Integer.parseInt(data[i-1])){
          String temp = data[i];
          data[i] = data[i-1];
          data[i-1] = temp;
          --i;
        }
        index++;
        final String output = Arrays.toString(data).replace("[", "").replace("]", "").replace(",", "");
        sb.append(output).append("\n");
        System.out.println(output);
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new InsertionSortPart2()).run();
  }
}
