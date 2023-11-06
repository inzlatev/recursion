package ru.skillsmart.recursion;

import java.util.LinkedList;
import java.util.List;

public class Part5 {

    //  9. Генерация всех корректных сбалансированных комбинаций круглых скобок (параметр -- количество открывающих скобок)
    public static List<String> generateBalancedBrackets(int n) {
        LinkedList<String> result = new LinkedList<>();
        generateBalancedBracketsRecursive(n, 0, 0, "", result);
        return result;
    }

    private static void generateBalancedBracketsRecursive(int n, int openCount, int closeCount, String current, LinkedList<String> result) {
        if (current.length() == n * 2) {
            result.add(current);
        } else {
            if (openCount < n) {
                generateBalancedBracketsRecursive(n, openCount + 1, closeCount, current + "(", result);
            }
            if (closeCount < openCount) {
                generateBalancedBracketsRecursive(n, openCount, closeCount + 1, current + ")", result);
            }
        }

    }


}
