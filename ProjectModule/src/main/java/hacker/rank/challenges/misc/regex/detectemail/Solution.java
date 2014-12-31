package hacker.rank.challenges.misc.regex.detectemail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

  public static class DetectEmails implements Runnable {

    private void parse(String str, final Set<String> emails){
      final Set<String> punctuations = new HashSet<>(Arrays.asList(".", "?", "!"));
      
      for (String token : str.split("\\s+")) {
          token = token.trim();
          if(token.matches(".*\\s.*")){ 
            parse(token, emails);
          }
          else{
            if (token.contains("@")) {
            //System.out.println(token);
              if (token.matches("[_a-zA-Z0-9\\.]+@[a-zA-Z0-9\\.]+\\.(com|in|org)[^\\s]?")) {
                final String[] tokens = token.split("@");
                String address = tokens[0]+ "@";
              
                final String end = String.valueOf(tokens[1].charAt(tokens[1].length()-1));
                address += punctuations.contains(end) ? tokens[1].substring(0, tokens[1].length()-1) : tokens[1];
              
                emails.add(address);
              }
            }
          }
        }
    }
    
    public String solve(final Scanner in) {

      int count = in.nextInt();
      in.nextLine();

      final Set<String> emails = new TreeSet<>();
      while (0 < count--) {
        final String str = in.nextLine();
        parse(str, emails);
      }
     // System.out.println(emails.toString().replace("[", "").replace("]", "").replace(",", ";"));
      return emails.toString().replace("[", "").replace("]", "").replace(", ", ";");
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new DetectEmails()).run();
  }
}
