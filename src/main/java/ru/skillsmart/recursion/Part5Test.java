package ru.skillsmart.recursion;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.skillsmart.recursion.Part5.generateBalancedBrackets;

public class Part5Test {
    @Test
    public void test() {
        List<String> result1 = generateBalancedBrackets(1);
        assertTrue(result1.contains("()"));

        List<String> result2 = generateBalancedBrackets(2);
        assertTrue(result2.containsAll(List.of("()()","(())")));

        List<String> result3 = generateBalancedBrackets(3);
        assertTrue(result3.containsAll(List.of("((()))", "(()())", "(())()", "()(())", "()()()")));
    }

}
