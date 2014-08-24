package hacker.rank.challenges.algorithms.warmup.gameofthrones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  
  public static class GameOfThrones implements Runnable {

    public String solve(final Scanner in) {
      
      final String line = in.nextLine();
      final Set<Character> characters = new HashSet<>();
      
      for(Character c : line.toCharArray()){
        
        if(!characters.contains(c)){
          characters.add(c);
        }else{
          characters.remove(c);
        }
      }
      
      if(characters.isEmpty() || 1 == characters.size()){
        return "YES";
      }
       
      return "NO";
    }
    
    @Override
    public void run() {
      System.out.println( solve(new Scanner(System.in)) );
    }
  }
  
  public static void main(String[] args){
    new Thread(new GameOfThrones()).run();
  }
}
