package attempt.hacker.rank.challenges.algorithms.search.mrkmarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  
  public static class MrKMarsh implements Runnable {

    private int height;
    private int width;
  
    private boolean isObstructed(int column, List<String> fields){
      for (String string : fields) {
        if(string.charAt(column) == 'x'){
          return true;
        }
      }
      return false;
    }
    
    private boolean isObstructed(int begin, int end, String row){
      for(int i = begin; i <= end; ++i){
        if(row.charAt(i) == 'x'){
          return true;
        }
      }
      return false;
    }
    
    private int getDimensions(int N, int S, int E, int W, List<String> field){
      
      if(N >= S || E >= W){return 0;}
      
      if(isObstructed(E, field.subList(N+1, S+1))){
        return getDimensions(N, S, E+1, W, field);
      }
        
      if(isObstructed(W, field.subList(N+1, S+1))) {
        return getDimensions(N, S, E, W-1, field);
      }
      
       if(isObstructed(E, W, field.get(N))){
        return Math.max(getDimensions(N+1, S, 0, width-1, field), getDimensions(N, S, E+1, W, field));
      }
      
      if(isObstructed(E, W, field.get(S))){
        return Math.max(getDimensions(0, S-1, 0, width-1, field), getDimensions(N, S-1, 0, W, field));
      }
      
      return 2 * (W - E) +  2 * (S - N);
    }
    
    public String solve(final Scanner in) {
      
        height = in.nextInt();
        width = in.nextInt();
      
      in.nextLine();
      final List<String> field = new ArrayList<>();
      for (int i = height; i > 0; --i) {
        field.add(in.nextLine());
      }
      
      final Integer result = getDimensions(0, height-1, 0, width-1, field);
      return  result == 0 ? "impossible" : result.toString();
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
