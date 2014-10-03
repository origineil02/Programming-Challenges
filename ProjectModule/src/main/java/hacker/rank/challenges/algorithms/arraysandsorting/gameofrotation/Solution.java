package hacker.rank.challenges.algorithms.arraysandsorting.gameofrotation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

  public static class GameOfRotation implements Runnable {

    private class Node {
      final int position;
      final Long value;

      public Node(int position, Long value) {
        this.position = position;
        this.value = value;
      }
    }
    public String solve(final Scanner in) {

      in.nextLine();
      final String[] numbers = in.nextLine().split(" ");
      final LinkedList<Node> data = new LinkedList<>();
      
      int index = 0;
      Long sum = 0L;
      Long wSum = 0L;
      for(String str : numbers){
        final long v = Long.parseLong(str);
        wSum += v * (index + 1);
        sum += v;
        data.add(new Node(index++, v));
      }
      
      Long max = wSum;
      
      do{
      data.addLast(data.removeFirst());
       
        wSum = wSum - sum + data.getLast().value * data.size();
      
      if(wSum > max){max = wSum;}
      
     }while(data.getFirst().position != 0);
      return max.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new GameOfRotation()).run();
  }
}
