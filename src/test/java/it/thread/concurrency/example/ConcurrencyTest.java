package it.thread.concurrency.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class ConcurrencyTest {

    @RepeatedTest(50)
    void printNumbersInOrder_whenThreadsRun_thenConsistentOrder() throws InterruptedException {
        Concurrency concurrency = new Concurrency();
        String result = concurrency.printNumbersInOrder();
        Assertions.assertEquals("1234", result);
    }
}
