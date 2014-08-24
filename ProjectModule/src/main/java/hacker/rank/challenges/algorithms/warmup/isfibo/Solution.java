package hacker.rank.challenges.algorithms.warmup.isfibo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  
  public static class IsFibo implements Runnable {

    private final Map<Long, Long> data = new HashMap<>();
    private Long key;
    
    private enum Ouput {IsFibo,IsNotFibo}
    
    public String solve(final Scanner in) {

      data.put(1L, 0L);
      key = 1L;
      
      final StringBuilder sb = new StringBuilder();

      int testCases = in.nextInt();
      in.nextLine();
      for ( ; testCases > 0; --testCases) {
        
        long number = Long.parseLong(in.nextLine());
          
          while(number > key){
            long next = data.get(key) + key;
            data.put(next, key);
            key = next;
          }
        
          if(data.containsKey(number)){
            System.out.println(Ouput.IsFibo);
            sb.append(Ouput.IsFibo);
          }
          else{
            System.out.println(Ouput.IsNotFibo);
            sb.append(Ouput.IsNotFibo);
          }
         
          sb.append("\n");
      }

      return sb.toString();
    }

    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new IsFibo()).run();
  }
}
