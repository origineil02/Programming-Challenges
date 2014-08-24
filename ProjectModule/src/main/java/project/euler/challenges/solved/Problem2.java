
package project.euler.challenges.solved;

import java.util.LinkedList;

public class Problem2 {
  public static void main(String[] args) {
    final LinkedList<Integer> values = new LinkedList<Integer>();
    values.addFirst(1);
    values.addFirst(2);
    
    Integer sum = 2;
    Integer currentValue;
    do
    {
      currentValue = values.getFirst() + values.get(1);
      values.addFirst(currentValue);
      if(0 == currentValue %2)
      {
        sum+=currentValue;
      }
      
    }while(currentValue < 4000000);
    
    System.out.println(sum);
  }
}
