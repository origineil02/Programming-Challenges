package project.euler.challenges.solved;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import project.euler.utils.Util;

  public class Problem87 {

    public static class PrimePowerTriples implements Runnable {

        public String solve(int boundary) {

            final Set<Integer> primes = Util.primes(BigInteger.valueOf(8000));
            final Long base = 1L;
            final Set<Long> values = new HashSet<>();
            for (Integer p1 : primes) {
                long a = base * p1 * p1 * p1 * p1;
                if(boundary < a){continue;}
                
                for (Integer p2 : primes) {
                
                    long b = base * p2 * p2 *p2;
                     
                    if(boundary < b){continue;}
                    for (Integer p3 : primes) {

                        long c = base * p3 * p3;
                        long calculation = c+b+a;
                        if(boundary < calculation){continue;}
                        //System.out.println(String.format("%d^2 + %d^3 + %d^4 = %d ", p3, p2, p1, calculation));
                        values.add(calculation);
                    }
                }
            }
            return String.valueOf(values.size());
        }

        @Override
        public void run() {
            System.out.println(solve(50000000));
        }
    }

    public static void main(String[] args) {
        new Thread(new PrimePowerTriples()).run();
    }
}
