package org.example;

import java.util.List;

public class PrimeResult {
    private List<Integer> primes;

    public PrimeResult () {

    }

    public PrimeResult(List<Integer> primes) {
        this.primes = primes;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }
}
