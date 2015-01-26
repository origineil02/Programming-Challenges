package attempt.hacker.rank.challenges.algorithms.summationandalgebra.summationtheNseries;

import java.util.Scanner;

/* 

Status

- Time exceeded X 1
- Runtime error X 2
- Wrong Anser X 1

*/

public class Solution {
  
  public static class SummationNSeries implements Runnable {
    
    public String solve(final Scanner in) {
      
      final long mod = ((Double)Math.pow(10, 9)).longValue();
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      
      while(0 < testCases--){
        int n = in.nextInt();
        long sum = 0;
        while(0 < n){
          sum += (n * n) - ( (n - 1) * (n-1) );
          n--;
        }
        
        sb.append(sum % mod).append("\n");
      }
      
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SummationNSeries()).run();
  }
}
