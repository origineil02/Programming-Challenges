package hacker.rank.challenges.algorithms.strings.panagrams;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  
  public static class Pangrams implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder("pangram");
      
      final String input = in.nextLine();
      final Set<String> characters = new HashSet<>();
      for(Character c : input.toCharArray()){
        if(!c.toString().trim().isEmpty()){
         characters.add(c.toString().toLowerCase());
        }
      }
      
      if(characters.size() != 26){sb.insert(0, "not ");}
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new Pangrams()).run();
  }
}
