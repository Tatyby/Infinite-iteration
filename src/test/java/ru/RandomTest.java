package ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class RandomTest {
    Randoms randoms = Mockito.mock();

    @Test
    public void listRandomTest() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        Mockito.when(randoms.listRandom()).thenReturn(expected);

        List<Integer> result = randoms.listRandom();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void generateRandomTest() {
        int expected = 10;
        Mockito.when(randoms.generateRandom()).thenReturn(10);
        int result = randoms.generateRandom();

        Assertions.assertEquals(expected, result);
    }
}


}




