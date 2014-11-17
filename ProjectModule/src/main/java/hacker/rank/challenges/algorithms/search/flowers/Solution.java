package hacker.rank.challenges.algorithms.search.flowers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
  
  public static class Flowers implements Runnable {

    public String solve(final Scanner in) {
      int N = in.nextInt();
      int K = in.nextInt();
      
      in.nextLine();
      
      final int[] friends = new int[K];
      final LinkedList<Integer> list = new LinkedList<>();
      
      int index = 0;
      int last = 0;
      for(String token : in.nextLine().split(" ")){
        friends[index%K] += 1; 
        list.add(Integer.parseInt(token));
        last = index%K;
        index = ++index % N;
      }
     
      Collections.sort(list);
      
      Long sum = 0L;
       
      index = last;
      while(!list.isEmpty()){
        sum +=  friends[index]  * list.removeFirst();
        friends[index] -= 1;
        index = index == 0 ? friends.length - 1 : index - 1;
      }
       
      return sum.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new Flowers()).run();
  }
}
