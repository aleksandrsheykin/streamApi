package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 24.04.2017.
 */
public class SumVal extends ReentrantLock {
    public static AtomicInteger value;
    public static AtomicBoolean flStop = new AtomicBoolean(false);

    public SumVal() {
        value = new AtomicInteger(0);
    }

    public static Integer sum(Object a) {
        value.addAndGet( (Integer) a);
        System.out.println(value.get());
        return (Integer) a;
    }
}
