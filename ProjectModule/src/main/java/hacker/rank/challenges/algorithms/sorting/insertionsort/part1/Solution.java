package hacker.rank.challenges.algorithms.sorting.insertionsort.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  
  public static class InsertionSortPart1 implements Runnable {

    public String solve(final Scanner in) {
     
      final StringBuilder output = new StringBuilder();
      final int size = in.nextInt();
      in.nextLine();
      final String[] data= in.nextLine().split("\\s");
      
      int index = size-1;
       
      while(index > 0 && data[index].compareTo(data[index-1]) < 0){
         
        final StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < size; ++i){
          sb.append(data[i==index ? index-1: i])
            .append(i<size-1 ? " " : "");
        }
        System.out.println(sb.toString());
        output.append(sb.toString()).append("\n");
        String temp = data[index-1];
        data[index-1] = data[index];
        data[index] = temp;
        index--;
      }
       
      final String sorted = Arrays.toString(data).replace("[", "").replace("]", "").replace(",", "");
      output.append(sorted).append("\n");
      System.out.println(sorted);
      return output.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new InsertionSortPart1()).run();
  }
}
