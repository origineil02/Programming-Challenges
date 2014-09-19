package hacker.rank.challenges.algorithms.arraysandsorting.makeitanagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  
  public static class MakeItAnagram implements Runnable {

    public String solve(final Scanner in) {
      
      final char[] a = in.nextLine().toCharArray();
      final char[] b = in.nextLine().toCharArray();
      
      Arrays.sort(a);
      Arrays.sort(b);
      
      int ptrA = 0;
      int ptrB = 0;
      
      int removals = 0;
      while(ptrA < a.length && ptrB < b.length){
        
        if(a[ptrA] == b[ptrB]){
          ptrA++;
          ptrB++;
        }
        else if(a[ptrA] < b[ptrB]){
          removals++;
          ptrA++;
        }
        else {
          removals++;
          ptrB++;
        }
      }
      return String.valueOf(removals + a.length - ptrA  + b.length - ptrB);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MakeItAnagram()).run();
  }
}
