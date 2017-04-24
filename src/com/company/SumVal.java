package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 24.04.2017.
 */
public class SumVal extends ReentrantLock {
    public Integer value = 0;
    public AtomicBoolean flStop = new AtomicBoolean(false);
}
