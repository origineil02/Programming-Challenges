package hacker.rank.challenges.algorithms.warmup.twostrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  
  public static class TwoStrings implements Runnable {

   private boolean sharesCharacter(String a, String b){
     
     final Set<Character> characters = new HashSet<>();
     for(Character c : b.toCharArray()){
      characters.add(c);
     }
     
     for(Character c : a.toCharArray()){
       if(characters.contains(c)){
         return true;
       }
     }
     return false;
   }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = Integer.parseInt(in.nextLine());
      while(0 < testCases--){
        sb.append(sharesCharacter(in.nextLine(), in.nextLine())? "YES" : "NO").append("\n");
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new TwoStrings()).run();
  }
}
