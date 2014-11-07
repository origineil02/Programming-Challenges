package hacker.rank.challenges.algorithms.arraysandsorting.quicksort.sorting;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

public class SolutionTest {
  
  @Test
  public void testSample() {
    new Solution.Sorting().solve(new Scanner("7\n5 8 1 3 7 9 2 "));

    final String output = "2 3\n"
            + "1 2 3\n"
            + "7 8 9\n"
            + "1 2 3 5 7 8 9";
    validate(new Scanner(output), new Scanner("2 3\n1 2 3\n7 8 9\n1 2 3 5 7 8 9\n"));

  }

  private void validate(Scanner A, Scanner E) {
    while (A.hasNext() && E.hasNext()) {
      String a = A.nextLine();
      String e = E.nextLine();
      //System.out.println("A:" + a);
      //System.out.println("E:" + e);

      assertEquals(a, e);
    }
    
    if((A.hasNext() && !E.hasNext()) || (!A.hasNext() && E.hasNext()) ){fail();}
  }

  @Test
  public void testCase() {
    final String input = "100\n"
            + "406 157 415 318 472 46 252 187 364 481 450 90 390 35 452 74 196 312 142 160 143 220 483 392 443 488 79 234 68 150 356 496 69 88 177 12 288 120 222 270 441 422 103 321 65 316 448 331 117 183 184 128 323 141 467 31 172 48 95 359 239 209 398 99 440 171 86 233 293 162 121 61 317 52 54 273 30 226 421 64 204 444 418 275 263 108 10 149 497 20 97 136 139 200 266 238 493 22 17 39";

    new Solution.Sorting().solve(new Scanner(input));
    final String output
            = "17 20 22\n"
            + "17 20 22 30\n"
            + "17 20 22 30 31\n"
            + "10 12 17 20 22 30 31\n"
            + "10 12 17 20 22 30 31 35 39\n"
            + "52 54\n"
            + "52 54 61 64\n"
            + "48 52 54 61 64\n"
            + "48 52 54 61 64 65\n"
            + "48 52 54 61 64 65 68 69\n"
            + "86 88\n"
            + "79 86 88\n"
            + "48 52 54 61 64 65 68 69 74 79 86 88\n"
            + "97 99\n"
            + "95 97 99\n"
            + "108 117\n"
            + "95 97 99 103 108 117\n"
            + "136 139\n"
            + "136 139 141\n"
            + "121 128 136 139 141\n"
            + "95 97 99 103 108 117 120 121 128 136 139 141\n"
            + "149 150\n"
            + "143 149 150\n"
            + "95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "162 171\n"
            + "162 171 172\n"
            + "183 184\n"
            + "162 171 172 177 183 184\n"
            + "160 162 171 172 177 183 184\n"
            + "200 204\n"
            + "200 204 209\n"
            + "226 233\n"
            + "222 226 233\n"
            + "238 239\n"
            + "222 226 233 234 238 239\n"
            + "200 204 209 220 222 226 233 234 238 239\n"
            + "196 200 204 209 220 222 226 233 234 238 239\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239\n"
            + "263 266\n"
            + "273 275\n"
            + "263 266 270 273 275\n"
            + "263 266 270 273 275 288 293\n"
            + "316 317\n"
            + "263 266 270 273 275 288 293 312 316 317\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317\n"
            + "323 331\n"
            + "321 323 331\n"
            + "321 323 331 356 359\n"
            + "392 398\n"
            + "390 392 398\n"
            + "321 323 331 356 359 364 390 392 398\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150 157 160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398\n"
            + "418 421\n"
            + "418 421 422 440\n"
            + "418 421 422 440 441\n"
            + "444 448\n"
            + "418 421 422 440 441 443 444 448\n"
            + "452 467\n"
            + "418 421 422 440 441 443 444 448 450 452 467\n"
            + "493 496 497\n"
            + "488 493 496 497\n"
            + "483 488 493 496 497\n"
            + "481 483 488 493 496 497\n"
            + "418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497\n"
            + "415 418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150 157 160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398 406 415 418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497";

    final String actual = "17 20 22\n"
            + "17 20 22 30\n"
            + "17 20 22 30 31\n"
            + "10 12 17 20 22 30 31\n"
            + "10 12 17 20 22 30 31 35 39\n"
            + "52 54\n"
            + "52 54 61 64\n"
            + "48 52 54 61 64\n"
            + "48 52 54 61 64 65\n"
            + "48 52 54 61 64 65 68 69\n"
            + "86 88\n"
            + "79 86 88\n"
            + "48 52 54 61 64 65 68 69 74 79 86 88\n"
            + "97 99\n"
            + "95 97 99\n"
            + "108 117\n"
            + "95 97 99 103 108 117\n"
            + "136 139\n"
            + "136 139 141\n"
            + "121 128 136 139 141\n"
            + "95 97 99 103 108 117 120 121 128 136 139 141\n"
            + "149 150\n"
            + "143 149 150\n"
            + "95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150\n"
            + "162 171\n"
            + "162 171 172\n"
            + "183 184\n"
            + "162 171 172 177 183 184\n"
            + "160 162 171 172 177 183 184\n"
            + "200 204\n"
            + "200 204 209\n"
            + "226 233\n"
            + "222 226 233\n"
            + "238 239\n"
            + "222 226 233 234 238 239\n"
            + "200 204 209 220 222 226 233 234 238 239\n"
            + "196 200 204 209 220 222 226 233 234 238 239\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239\n"
            + "263 266\n"
            + "273 275\n"
            + "263 266 270 273 275\n"
            + "263 266 270 273 275 288 293\n"
            + "316 317\n"
            + "263 266 270 273 275 288 293 312 316 317\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317\n"
            + "323 331\n"
            + "321 323 331\n"
            + "321 323 331 356 359\n"
            + "392 398\n"
            + "390 392 398\n"
            + "321 323 331 356 359 364 390 392 398\n"
            + "160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150 157 160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398\n"
            + "418 421\n"
            + "418 421 422 440\n"
            + "418 421 422 440 441\n"
            + "444 448\n"
            + "418 421 422 440 441 443 444 448\n"
            + "452 467\n"
            + "418 421 422 440 441 443 444 448 450 452 467\n"
            + "493 496 497\n"
            + "488 493 496 497\n"
            + "483 488 493 496 497\n"
            + "481 483 488 493 496 497\n"
            + "418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497\n"
            + "415 418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497\n"
            + "10 12 17 20 22 30 31 35 39 46 48 52 54 61 64 65 68 69 74 79 86 88 90 95 97 99 103 108 117 120 121 128 136 139 141 142 143 149 150 157 160 162 171 172 177 183 184 187 196 200 204 209 220 222 226 233 234 238 239 252 263 266 270 273 275 288 293 312 316 317 318 321 323 331 356 359 364 390 392 398 406 415 418 421 422 440 441 443 444 448 450 452 467 472 481 483 488 493 496 497\n";
    validate(new Scanner(actual), new Scanner(output));
  }
}
