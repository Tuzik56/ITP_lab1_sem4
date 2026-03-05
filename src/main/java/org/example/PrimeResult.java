package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeResult {
    private List<Integer> primes;

    public PrimeResult () {

    }

    public PrimeResult(List<Integer> primes) {
        this.primes = new ArrayList<>(primes);
    }

    public List<Integer> getPrimes() {
        return new ArrayList<>(primes);
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = new ArrayList<>(primes);
    }
}
