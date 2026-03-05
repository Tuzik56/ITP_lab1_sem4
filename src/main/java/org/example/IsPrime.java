package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {
    private static final Logger log = LoggerFactory.getLogger(IsPrime.class);

    public static void main(String[] args) throws JsonProcessingException {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        //Сериализация
        PrimeResult originalResult = new PrimeResult(primes);
        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(originalResult);
        log.info(json);

        //Десериализация
        PrimeResult deserializedResult = mapper.readValue(json, PrimeResult.class);
        log.info(deserializedResult.getPrimes().toString());

        bugExample();
    }

    public static boolean isPrime(int n) {
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                log.debug("{}/{}", n, i);
                return false;
            }
            i++;
        }
        return true;
    }

    public static void bugExample() {
        String s = null;
        s.length();
    }
}
