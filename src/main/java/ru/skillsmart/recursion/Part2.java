package ru.skillsmart.recursion;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Part2 {

    //расчёт длины списка, для которого разрешена только операция удаления первого элемента pop(0)
    public static <E> int listLength(LinkedList<E> list) {
        if (list.isEmpty())
            return 0;

        list.pop();
        return 1 + listLength(list);
    }

    //проверка, является ли строка палиндромом
    public static boolean handlePalyndrome(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll(" ", "").toLowerCase();
        LinkedList<Character> listToVerify = stringToVerify.chars().mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedList::new));

        return isPalyndrome(listToVerify);
    }

    private static boolean isPalyndrome(LinkedList<Character> listToVerify) {
        if (listToVerify.size() < 2)
            return true;

        if (!listToVerify.pollFirst().equals(listToVerify.pollLast())) {
            return false;
        }
        return isPalyndrome(listToVerify);
    }

}
