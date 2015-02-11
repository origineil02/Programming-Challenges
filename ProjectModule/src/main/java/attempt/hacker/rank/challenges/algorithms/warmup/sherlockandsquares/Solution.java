package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandsquares;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
  
  public static class SherlockAndSquares implements Runnable {

    private void test(long i, Integer lowerBound, Integer upperBound, Set<Long> repo){
      long value = i*i;
      boolean withinBounds = value >= lowerBound && value <=upperBound;
      if(withinBounds && !repo.contains(i)){
        repo.add(value);
        test(value, lowerBound, upperBound, repo);
      }
    }
    
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
     
      while(0 < testCases--){
        int begin = in.nextInt();
        int end =  in.nextInt();
        
        final Set<Long> repo = new TreeSet<>();
        for(int j = begin;j<=end;j++){
          Double d = Math.sqrt(j);
          test(d.longValue(),begin, end, repo);
        }
        sb.append(repo.size()).append("\n");
      } 
          
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndSquares()).run();
  }
}
