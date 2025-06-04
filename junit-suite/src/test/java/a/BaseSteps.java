package a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;


class BaseSteps {

    private static AtomicInteger counter = new AtomicInteger();
    
    @Test
    void test(){
        int i = counter.getAndIncrement();
        System.out.println("Value " + i);
        if (i < 1) {
            Assertions.fail();
        }
    }    
}
