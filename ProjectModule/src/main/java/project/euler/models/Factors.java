package project.euler.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Factors {

  private final Map<Integer, List<FactorPair>> map;
  private Set<FactorPair> factors;
  
  public Factors() {
    map = new HashMap<Integer, List<FactorPair>>();
    factors = new HashSet<FactorPair>();
  }

  public void addFactorPair(final FactorPair pair) {
    factors.add(pair);
  }

  public Set<FactorPair> getFactorPairs() {
    return factors;
  }

  public Set<Integer> values() {
    final Set<Integer> values = new HashSet<Integer>(map.keySet());

    for (List<FactorPair> list : map.values()) {
      for (FactorPair factorPair : list) {
        values.add(factorPair.getValue2());
      }
    }
    return values;
  }
}
