package ru.skillsmart.recursion;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class Part1Test {

    @Test
    public void checkPower() {
        int n = (int) (Math.random() * 10);
        int m = (int) (Math.random() * 10);
        assertEquals(Part1.power(n, m), (int) Math.pow(n, m));
    }

    @ParameterizedTest
    @ValueSource(ints = {123, 35353, 0, 1, 123456789})
    public void checkSum(int value) {
        int sum = Part1.sum(value);

        int expected = String.valueOf(value).chars().map(Character::getNumericValue).sum();
        assertEquals(expected, sum);
    }

}
