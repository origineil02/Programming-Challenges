package hacker.rank.challenges.algorithms.search.lonelyinteger;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

  public static class LonelyInteger implements Runnable {

    public String solve(final Scanner in) {

      in.nextLine();
      final String[] tokens = in.nextLine().split(" ");
      final Set<String> container = new HashSet<>();
      for(String token : tokens) {
        if(container.contains(token)){
         container.remove(token);
        }
        else{
          container.add(token);
        }
      }
      
      return container.iterator().next();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new LonelyInteger()).run();
  }
}
