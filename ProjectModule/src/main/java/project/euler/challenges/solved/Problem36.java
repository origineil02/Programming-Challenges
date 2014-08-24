package project.euler.challenges.solved;

import project.euler.utils.Util;

public class Problem36
{

  public static void main(final String[] args)
  {
    System.out.println(new DoubleBasePalindrome().solve());
  }

  static class DoubleBasePalindrome
  {

    public Integer solve()
    {

      Integer sum = 0;
      for (Integer i = 1; i < 1000000; i++)
      {
        if (isDoubleBasePalindrome(i))
        {
          sum += i;
        }
      }
      return sum;
    }

    public boolean isDoubleBasePalindrome(final Integer i)
    {
      if (Util.isPalindrome(i.toString()))
      {
        if(Util.isPalindrome(Integer.toBinaryString(i)))
        {
          return true;
        }
      }
      return false;
    }
  }
}
