package project.euler.models;

public class PerimeterDimensions
{

  private final int a,
          b,
          c;

  public PerimeterDimensions(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public int hashCode()
  {
    int hash = 7;
    hash = 13 * hash + this.a;
    hash = 13 * hash + this.b;
    hash = 13 * hash + this.c;
    return hash;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == null)
    {
      return false;
    }
    if (getClass() != obj.getClass())
    {
      return false;
    }
    final PerimeterDimensions other = (PerimeterDimensions) obj;
    if (this.a != other.a)
    {
      return false;
    }
    if (this.b != other.b)
    {
      return false;
    }
    if (this.c != other.c)
    {
      return false;
    }
    return true;
  }

  @Override
  public String toString()
  {
    return "PerimeterDimensions{" + a + "," + b + "" + c + '}';
  }
}
