package hacker.rank.challenges.misc.regex.language;

import java.util.Scanner;

public class Solution {

  public static class HackerRankLanguage implements Runnable {

    public String solve(final Scanner in) {

      int testCases = in.nextInt();
      in.nextLine();

      final StringBuilder sb = new StringBuilder();
      while (0 < testCases--) {
        final String language = in.nextLine().split(" ")[1];
         
        boolean flag = language.matches("(C(PP|L(ISP|OJURE)|SHARP)?)")
                || language.matches("B(RAINFUCK|ASH)")
                || language.matches("(D(ART)?)")
                || language.matches("(ERLANG)")
                || language.matches("(G(O|ROOVY))")
                || language.matches("(HASKELL)")
                || language.matches("(JAVA(SCRIPT)?)")
                || language.matches("(LUA)")
                || language.matches("(O(BJECTIVEC|CAML))")
                || language.matches("(P(ASCAL|YTHON|ERL|HP))")
                || language.matches("(R(UBY)?)")
                || language.matches("(S(BCL|CALA))");

        sb.append(flag ? "" : "IN")
                .append("VALID")
                .append("\n");
      }

      return sb.toString();
    }

    @Override
    public void run() {
      System.out.println(solve(new Scanner(System.in)));
    }
  }

  public static void main(String[] args) {
    new Thread(new HackerRankLanguage()).run();
  }
}
