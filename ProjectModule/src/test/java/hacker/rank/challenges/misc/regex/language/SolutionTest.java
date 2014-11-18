package hacker.rank.challenges.misc.regex.language;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testSample() {
    final String input = "3\n"
            + "11011 LUA\n"
            + "11022 BRAINFUCK\n"
            + "11044 X";

    assertEquals("VALID\nVALID\nINVALID\n", new Solution.HackerRankLanguage().solve(new Scanner(input)));
  }

  public void testProblemStatement() {
    final String input = " BASH\n"
            + " BRAINFUCK\n"
            + " C\n"
            + " CLISP\n"
            + " CLOJURE\n"
            + " CPP\n"
            + " CSHARP\n"
            + " D\n"
            + " DART\n"
            + " ERLANG\n"
            + " GO\n"
            + " GROOVY\n"
            + " HASKELL\n"
            + " JAVA\n"
            + " JAVASCRIPT\n"
            + " LUA\n"
            + " OBJECTIVEC\n"
            + " OCAML\n"
            + " PASCAL\n"
            + " PYTHON\n"
            + " PERL\n"
            + " PHP\n"
            + " R\n"
            + " RUBY\n"
            + " SBCL\n"
            + " SCALA";

    for (String str : input.split("\n")) {
      assertEquals("Invalid: " + str, "VALID\n", new Solution.HackerRankLanguage().solve(new Scanner("1\n"+str)));
    }
  }
}
