package hacker.rank.challenges.algorithms.warmup.gemstones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  
  public static class GemStones implements Runnable {

    public String solve(final Scanner in) {
      
      int terminator = in.nextInt();
      in.nextLine();
      
      final Set<Character> elements = new HashSet<>();
      for(int testCases = 0; testCases < terminator; ++testCases){
        final String line = in.nextLine();
        
        final Set<Character> current = new HashSet<>();
        for(char c : line.toCharArray()){
          current.add(c);
        }
        if(elements.isEmpty()){
          elements.addAll(current);
        }
        else{
          elements.retainAll(current);
            
          if(elements.isEmpty()){
            break;
          }
        }
      }
      System.out.println(elements.size());
      return String.valueOf(elements.size());
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new GemStones()).run();
  }
}
