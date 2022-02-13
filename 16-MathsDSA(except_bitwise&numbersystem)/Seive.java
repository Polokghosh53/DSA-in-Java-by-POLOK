package com.company;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }
    // TC: O(N * log(log(N)))
    // SC: O(N)
    // log(log(N)) is due to the harmonic series value where non primes were
    // at multiples in: n/2 + n/3 + n/5 + n/7 and so on.
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
