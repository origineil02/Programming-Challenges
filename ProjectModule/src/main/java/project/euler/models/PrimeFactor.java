
package project.euler.models;

public class PrimeFactor {
 private final Integer value;
 private Integer count;

  public PrimeFactor(final Integer value) {
    this.value = value;
    count = 1;
  }

  public Integer getValue() {
    return value;
  }

  public Integer getFactorCount() {
    return count;
  }
 
  public void incrementFactorCount()
  {
    count++;
  }

  @Override
  public String toString() {
    return "PrimeFactor{" + "value=" + value + ", count=" + count + '}';
  }
  
}
