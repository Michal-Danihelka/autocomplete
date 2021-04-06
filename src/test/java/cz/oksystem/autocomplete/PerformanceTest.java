package cz.oksystem.autocomplete;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    public static <T> void call(String description, Callable<T> method) throws Exception {
        long startTime = System.nanoTime();
        method.call();
        System.out.println(description + ": " + TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - startTime) + "micros");
    }

    public static void call(String description, Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        System.out.println(description + ": " + TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - startTime) + "micros");
    }
}
