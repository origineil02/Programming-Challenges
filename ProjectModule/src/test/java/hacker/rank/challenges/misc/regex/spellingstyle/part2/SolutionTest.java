package hacker.rank.challenges.misc.regex.spellingstyle.part2;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSample() {

    final String input = "2\n"
            + "the odour coming out of the left over food was intolerable\n"
            + "ammonia has a very pungent odor\n"
            + "1\n"
            + "odour";

    assertEquals("2", new Solution.SpellingStylePart2().solve(new Scanner(input)));
  }
 
  @Test
  public void testCase2() {
    final String input = "10\n"
            + "businessman video demeanor demeanor dishonest acknowledge dvd honor sister opportunity\n"
            + "keen labour artistic favourite red definition impatient take behaviour warmth\n"
            + "favourite december associated legal examine performance construction savoury prior infected\n"
            + "explanation establish unfriendly speed pointed slip candy one behaviour honor\n"
            + "woman lot basic throw honor somebody pollution use dog unhappiness\n"
            + "disgust attract penny reduction performance teacher ally splendor smash pilot\n"
            + "kindness labour aged demeanor remains cough immoral request rancor lesson\n"
            + "soap behavior vision happen new disc generously favorite l melt\n"
            + "mathematics candidate none keen honour lift jam savoury large dr\n"
            + "accept restriction young library similar film confront direct stone honour\n"
            + "7\n"
            + "behaviour\n"
            + "honour\n"
            + "demeanour\n"
            + "splendour\n"
            + "savoury\n"
            + "favourite\n"
            + "rancour";

    assertEquals("3\n5\n3\n1\n2\n3\n1", new Solution.SpellingStylePart2().solve(new Scanner(input)));
  }

  @Test
  public void testCase5() {
    final String input = "10\n"
            + "splendour wealth piece recognition savoury endeavour oil cannot reality fish\n"
            + "sincere savor argument vigour chain awake cap surprising savoury jump\n"
            + "natural study process immoral flag vigour habit assist candy pet\n"
            + "shoulder aside slightly onto crash later disagreement savour rumour entrance\n"
            + "splendour petrol unable inevitably crowd growth fasten leading responsibility artificially\n"
            + "equally alarmed also knowledge ok splendor armory pick sale be\n"
            + "activity rumour ending alcoholic savory curve splendour honestly enjoyable rumour\n"
            + "determined used rumor union affair odor granddaughter elect endeavor alter\n"
            + "savor hour enjoyable waiter divorce at mental prepared folding primary\n"
            + "cheaply vegetable upon splendor disease savor it cast hear cardboard\n"
            + "9\n"
            + "endeavour\n"
            + "savoury\n"
            + "savour\n"
            + "vigour\n"
            + "valour\n"
            + "splendour\n"
            + "rumour\n"
            + "odour\n"
            + "armoury";
    
    assertEquals("2\n3\n4\n2\n0\n5\n4\n1\n1", new Solution.SpellingStylePart2().solve(new Scanner(input)));
  }
}
