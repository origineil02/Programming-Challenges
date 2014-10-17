package hacker.rank.challenges.misc.regex.utopianidentificationnumber;
import java.util.Scanner;

public class Solution {
  
  public static class UtopianIdNumber implements Runnable {

    public String solve(final Scanner in) {
      final StringBuilder sb = new StringBuilder();
      
      int testCases = in.nextInt();
      in.nextLine();
      while(0 < testCases--){
        final String line = in.nextLine();
        sb.append(line.matches("[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}") ? "" : "IN").append("VALID").append("\n");
      }
      return sb.toString();
    }
    
    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }
  
  public static void main(String[] args){
    new Thread(new UtopianIdNumber()).run();
  }
}
