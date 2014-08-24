import java.util.Scanner;

public class Solution {
  
  public static class ClassName implements Runnable {

    public String solve(final Scanner in) {
      
      return "";
    }
    
    @Override
    public void run() {
      solve(new Scanner(System.in));
    }
  }
  
  public static void main(String[] args){
    new Thread(new ClassName()).run();
  }
}
