package project.euler.challenges.solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem92 {

    public static class SquareDigitChains implements Runnable {

        private int getResult(final Map<Integer, Set<Integer>> map, int value) {
            //System.out.print(value + " -> ");
            int sum = 0;
            for (Character c : String.valueOf(value).toCharArray()) {
                sum += ((Double) Math.pow(Integer.parseInt(c.toString()), 2)).intValue();
            }

            if (sum == 1 || sum == 89) {
                return sum;
            }else if(map.get(1).contains(sum)){
                return 1;
            }else if(map.get(89).contains(sum)){
                return 89;
            }
            else {
                return getResult(map, sum);
            }
        }

        public String solve() {
            final Map<Integer, Set<Integer>> map = new HashMap<>();
            map.put(1, new HashSet<Integer>());
            map.put(89, new HashSet<Integer>());

            for (int i = 1; i < 10000000; ++i) {

                int result = getResult(map, i);
                //System.out.println(result);
                map.get(result).add(i);
            }

            return String.valueOf(map.get(89).size());
        }

        @Override
        public void run() {
            solve();
        }
    }

    public static void main(String[] args) {
        new Thread(new SquareDigitChains()).run();
    }
}
