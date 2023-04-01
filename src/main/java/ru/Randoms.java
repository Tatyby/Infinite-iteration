package ru;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    private final int max;
    private final int min;
    protected Random random;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    public List<Integer> listRandom() {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (max - min); i++) {
            list.add(generateRandom());
        }
        return list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index;

            @Override
            public boolean hasNext() {
                if (index < listRandom().size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() throws IndexOutOfBoundsException {
                try {
                    index++;
                    return listRandom().get(index);
                } catch (IndexOutOfBoundsException e) {
                    throw new IndexOutOfBoundsException("Такого числа нет");
                }
            }
        };
    }

    public int generateRandom() {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
