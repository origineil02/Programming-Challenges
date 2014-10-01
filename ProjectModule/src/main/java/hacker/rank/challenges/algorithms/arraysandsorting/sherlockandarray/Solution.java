package hacker.rank.challenges.algorithms.arraysandsorting.sherlockandarray;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
  
  public static class SherlockAndArray implements Runnable {

    private class Node {
      private final long sumLeft;  
      private final long value;

      public Node(long value, long sum){
        this.value = value;
        this.sumLeft = sum;
      }
      
      public String toString(){
        return value + " | " + sumLeft;
      }
    }
    
    public String solve(final Scanner in) {
      final StringBuilder sb = new StringBuilder();

      int testCases = in.nextInt();
      
      while(testCases-- > 0){
        final LinkedList<Node> list = new LinkedList<>();
        int size = in.nextInt();
        
        if(size == 1){sb.append("YES\n"); in.nextInt(); continue;}
        
        while(size-- > 0){
          list.add(new Node(in.nextInt(), list.isEmpty() ? 0 : list.getLast().value + list.getLast().sumLeft));
        }
        
        boolean yes = false;
        final Node last = list.getLast();
        for(Node n : list){
         if(n.equals(list.getFirst()) || n.equals(last)){continue;}
         long sumRight = last.sumLeft + last.value - (n.sumLeft + n.value);
         if(n.sumLeft == sumRight){
          sb.append("YES\n"); 
          yes = true;
          break;
         }
         else if(n.sumLeft > sumRight){break;}
        }
        sb.append(yes ? "" : "NO\n");
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new SherlockAndArray()).run();
  }
}
