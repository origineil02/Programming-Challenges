package project.euler.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrimeFactors {

  final private Map<Integer, PrimeFactor> map;

  public PrimeFactors() {
    this.map = new HashMap();
  }

  public void add(final Integer value) {
    if (!map.containsKey(value)) {
      map.put(value, new PrimeFactor(value));
    }
    else {
      map.get(value).incrementFactorCount();
    }
  }

  public Set<Integer> values() {
    return map.keySet();
  }
//
  public PrimeFactor getFactor(Integer key) {
    return map.get(key);
  }
}
