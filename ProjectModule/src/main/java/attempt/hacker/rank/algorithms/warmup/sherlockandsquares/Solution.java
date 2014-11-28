package attempt.hacker.rank.algorithms.warmup.sherlockandsquares;

import java.util.Scanner;
import java.util.Set;

public class Solution {
  
  public static class SherlockAndSquares implements Runnable {

    private void test(long i, Integer bound, Set<Integer> repo){
      if(i*i<=bound){
        repo.add(bound);
        test(i*i, bound, repo);
      }
    }
    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
     
      for(int i=0; i < testCases; ++i){
        int target = in.nextInt();
        int end =  in.nextInt();
      } 
          
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndSquares()).run();
  }
}
