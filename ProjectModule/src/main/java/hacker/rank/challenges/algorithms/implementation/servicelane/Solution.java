package hacker.rank.challenges.algorithms.implementation.servicelane;

import java.util.Scanner;

public class Solution {

  public static class ServiceLane implements Runnable {

    public String solve(final Scanner in){
      final StringBuilder sb = new StringBuilder();
      
      int terminator = Integer.parseInt(in.nextLine().split("\\s")[1]);
      
      final String widths = in.nextLine().replaceAll("\\s", "");
      
      for (int i = 0; i < terminator; ++i) {

        int enter = in.nextInt();
        int exit = in.nextInt();
        
        int inclusiveExit = exit + 1 > widths.length() ? widths.length() : exit + 1;
        final String section = widths.substring(enter, inclusiveExit);
        
        if(section.contains("1")){
          System.out.println(1);
          sb.append("1\n");
        }else if(section.contains("2")){
          System.out.println(2);
          sb.append("2\n");
        }
        else{
          System.out.println(3);
          sb.append("3\n"); 
        }
      }
      
      return sb.toString();
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }

  public static void main(String[] args) {
    new Thread(new ServiceLane()).run();
  }
}

