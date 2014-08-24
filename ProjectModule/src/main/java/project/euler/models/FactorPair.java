package project.euler.models;

public class FactorPair {
 private Integer value1; 
 private Integer value2;

  public FactorPair(Integer value1, Integer value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public Integer getValue1() {
    return value1;
  }

  public Integer getValue2() {
    return value2;
  }

  @Override
  public String toString() {
    return "FactorPair{" +   value1 + " x " + value2 + '}';
  }
  
  
}
