package project.euler.challenges.solved;

import project.euler.utils.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem24
{

  public static void main(final String[] args)
  {
    System.out.println(new Problem24.Lexigraphic().solve(1000000, "0123456789"));
  }

  static class Lexigraphic
  {

    public String solve(int index, String digits)
    {
      final List<String> list = new ArrayList<String>(Util.permutate(digits));
      Collections.sort(list);
      return list.get(index - 1);
    }
  }

  public static void main2(final String[] args)
  {
    final List<Obj> threads = Arrays.asList(new Obj(123456789, ObjType.INCREMENT),
            new Obj(978543210, ObjType.DECREMENT));

    for (Obj obj : threads)
    {
      final Thread t = new Thread(obj);
      t.start();
    }

    while (threads.get(0).getStart() < threads.get(1).getStart())
    {
//      System.out.println(threads.get(0).getStart() + " " + threads.get(1).getStart());
    }

    threads.get(0).terminate();
    threads.get(1).terminate();

    final Set<String> results = new HashSet(threads.get(0).getPermutations());
    results.addAll(threads.get(1).getPermutations());

    final List<String> data = new ArrayList(results);
    Collections.sort(data);

    //3178494
    System.out.println("Size " + data.size());

    System.out.println(data.get(999999));
    System.out.println(data.get(1000000));
  }

  static String permutate()
  {
    final Set<String> permutations = new HashSet<String>();

    for (int i = 123456789; i <= 978543210; i++)
    {
      final String str = String.valueOf(i);

      boolean fail = false;
      for (char c : str.toCharArray())
      {
        final String local = str.replaceAll(String.valueOf(c), "");
        if (local.length() != str.length() - 1)
        {
          fail = true;
          break;
        }
      }

      if (!fail)
      {
        permutations.add(str);
      }
    }

    final List<String> data = new ArrayList(permutations);
    Collections.sort(data);

    System.out.println(data.size());
    return data.get(999999);
  }

  private enum ObjType
  {

    INCREMENT,
    DECREMENT
  }

  private static class Obj implements Runnable
  {

    private Integer start;
    private ObjType type;
    private Set<String> permutations;
    private boolean terminated = false;

    public Obj(Integer start, ObjType type)
    {
      this.start = start;
      this.type = type;
    }

    @Override
    public void run()
    {
      permutations = new HashSet<String>();
      switch (type)
      {
        case DECREMENT:
          for (; !terminated; --start)
          {
            validate();
          }
          break;
        case INCREMENT:
          for (; !terminated; ++start)
          {
            validate();
          }
          break;
      }
    }

    public Integer getStart()
    {
      return start;
    }

    public void terminate()
    {
      terminated = true;
    }

    public Set<String> getPermutations()
    {
      return permutations;
    }

    private void validate()
    {
      final String str = String.valueOf(start);

      boolean fail = false;
      for (char c : str.toCharArray())
      {
        final String local = str.replaceAll(String.valueOf(c), "");
        if (local.length() != str.length() - 1)
        {
          fail = true;
          break;
        }
      }

      if (!fail)
      {
        permutations.add(str);
      }
    }
  }
}
