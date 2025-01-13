package io.cucumber.guice.integration.parallel;

import com.google.inject.Singleton;

import java.util.concurrent.atomic.AtomicInteger;

@Singleton
public class SingletonResource {
    public static final AtomicInteger GLOBAL_COUNT = new AtomicInteger(0);
    public final int instanceCountAfterConstruction = GLOBAL_COUNT.incrementAndGet();
}
