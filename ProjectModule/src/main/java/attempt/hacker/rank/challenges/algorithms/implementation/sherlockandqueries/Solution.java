package attempt.hacker.rank.challenges.algorithms.implementation.sherlockandqueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  public static class SherlockAndQueries implements Runnable {

    public String solve2(final BufferedReader in) throws IOException {
      String[] params = in.readLine().split("\\s");
      int n = Integer.parseInt(params[0]);
      int m = Integer.parseInt(params[1]);

      BigInteger[] a = new BigInteger[n+1];
      BigInteger[] answer = new BigInteger[n];
      int[] b = new int[m+1];
      BigInteger[] c = new BigInteger[m+1];
      
      String[] aStr = ("0 " + in.readLine()).split("\\s");
      String[] bStr = ("0 " + in.readLine()).split("\\s");
      String[] cStr = ("0 " + in.readLine()).split("\\s");
      
      
      BigInteger offset = new BigInteger(((Long)new Double(Math.pow(10, 9) + 7).longValue()).toString());
      
      for (int i = 1; i <= m; i++) {
        c[i] = new BigInteger(cStr[i]);
        b[i] = Integer.parseInt(bStr[i]);
        
        for (Integer j = b[i]; j <= n; j+=b[i]) {
          
            BigInteger value =  new BigInteger(aStr[j]).multiply(c[i]);
            aStr[j] = value.toString();
            answer[j-1] = value.mod(offset);
        }
      }
      
      String str = Arrays.toString( answer );
      str = str.replace("[", "").replace("]", "").replace(",", "");
      
      return str;
      
    }
    
    public String solve(final Scanner in) {

      final StringBuilder sb = new StringBuilder();

      int n = in.nextInt();
      int m = in.nextInt();

      long[] a = new long[n+1];
      long[] answer = new long[n];
      long[] b = new long[m+1];
      long[] c = new long[m+1];

      populateArray(a, in);
      populateArray(b, in);
      populateArray(c, in);

      long offset = (long)(Math.pow(10, 9) + 7);
      
      for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
          if (j % b[i] == 0) {
            a[j] =  ((a[j]* offset) * c[i])/offset;
            answer[j-1] = a[j];
            //System.out.println(a[j]);
          }
        }
      }

      String str = Arrays.toString( answer );
      str = str.replace("[", "").replace("]", "").replace(",", "");
      
      return str;
    }

    @Override
    public void run() {
      try{
      System.out.println(solve2(new BufferedReader(new InputStreamReader(System.in))));
      }catch(Exception e){}
    }

    private void populateArray(long[] array, final Scanner in) {
      for (int i = 1; i < array.length; i++) {
        array[i] = in.nextInt();
      }
    }
  }

  public static void main(String[] args) {
    new Thread(new SherlockAndQueries()).run();
  }
}
