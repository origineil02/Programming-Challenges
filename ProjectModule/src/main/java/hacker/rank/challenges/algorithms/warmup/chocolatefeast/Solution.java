package hacker.rank.challenges.algorithms.warmup.chocolatefeast;

import java.util.Scanner;

public class Solution {
  
  public static class ChocolateFeast implements Runnable {

    public String solve(final Scanner in) {
      
      final StringBuilder sb = new StringBuilder();
      for(int i = in.nextInt(); i > 0; --i){
        int initialPurchase = in.nextInt() / in.nextInt();
        int total = exchange(initialPurchase, in.nextInt(), initialPurchase);
        System.out.println(total);
        sb.append(total).append("\n");
      }
      return sb.toString();
    }
    
    private int exchange(int wrappers, int discount, int total){
      
      if(wrappers >= discount){
        int exchanged = wrappers / discount;
        return exchange(wrappers % discount + exchanged , discount, total + exchanged);
      }
      return total;
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new ChocolateFeast()).run();
  }
}
