package attempt.hacker.rank.challenges.algorithms.warmup.sherlockandgcd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class SherlockAndGCD implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      int testCases = in.nextInt();
      while(0 < testCases--){
        int size = in.nextInt();
        
        final List<Integer> evens = new ArrayList<>();
        final List<Integer> odds = new ArrayList<>();
        
        boolean flag = false;
        for(int i = 0; i < size; ++i){
          int input = in.nextInt();
          
          if(input % 2 == 0){
            evens.add(input);
          }
          else{
            odds.add(input);
          }
          
          if(1==input || !evens.isEmpty() && !odds.isEmpty()){
            sb.append("YES").append("\n");
            in.nextLine();
            flag=true;
            break;
          }
        }
        
        if(!flag){
          if(!evens.isEmpty() && evens.size() == 1 || !odds.isEmpty() && odds.size() == 1){
            sb.append("YES").append("\n");
          }else{
            sb.append("NO").append("\n");
          }
        }
      }
      return sb.toString().trim();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndGCD()).run();
  }
}
