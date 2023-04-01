package ru;

import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    private final int max;
    private final int min;
    protected Random random;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((max - min) + 1) + min;
            }
        };
    }
}

