package project.euler.challenges.solved;

public class Problem40
{

  public static void main(final String[] args)
  {
    System.out.println(new ChampernowneConstant().solve());
  }

  static class ChampernowneConstant
  {

    public Integer solve()
    {
      Integer product = 1;
      for (int i = 1; i <= 1000000; i *= 10)
      {
        final String str = generateSequence(i);
        final Character c = str.charAt(i);

        product *= Integer.parseInt(c.toString());
      }
      return product;
    }

    public String generateSequence(int max)
    {

      final StringBuilder sb = new StringBuilder(".");
      for (int i = 1; i <= max; i++)
      {
        sb.append(i);
      }
      return sb.toString();
    }
  }
}
