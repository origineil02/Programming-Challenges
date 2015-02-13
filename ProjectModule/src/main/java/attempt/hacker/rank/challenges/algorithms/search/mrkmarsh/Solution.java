package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class MrKMarsh implements Runnable {

    private boolean isObstructed(int column, List<String> fields){
      for (String string : fields) {
        if(string.toCharArray()[column] == 'x'){
          return true;
        }
      }
      return false;
    }
    
    private String getDimensions(int N, int S, int E, int W, List<String> field){
      
      if(N >= S || E >= W){return "impossible";}
      
      if(field.get(N).contains("x")){
        return getDimensions(N+1, S, E, W, field);
      }
      
      if(field.get(S).contains("x")){
        return getDimensions(N, S-1, E, W, field);
      }
      
      if(isObstructed(E, field.subList(N, S))){
        return getDimensions(N, S, E+1, W, field);
      }
        
      if(isObstructed(W, field.subList(N, S))) {
        return getDimensions(N, S, E, W-1, field);
      }
      
      return String.valueOf(2 * (W - E) +  2 * (S - N));
    }
    
    public String solve(final Scanner in) {
      
      final int height = in.nextInt();
      final int width = in.nextInt();
      
      in.nextLine();
      final List<String> field = new ArrayList<>();
      for (int i = height; i > 0; --i) {
        field.add(in.nextLine());
      }
      
      return getDimensions(0, height-1, 0, width-1, field);
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new MrKMarsh()).run();
  }
}
