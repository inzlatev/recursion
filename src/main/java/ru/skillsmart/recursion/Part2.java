package ru.skillsmart.recursion;

import java.util.LinkedList;

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
        return isPalyndrome(stringToVerify);
    }

    private static boolean isPalyndrome(String stringToVerify) {
        if (stringToVerify.length() < 2)
            return true;

        if (stringToVerify.charAt(0) != stringToVerify.charAt(stringToVerify.length() - 1)) {
            return false;
        }
        return isPalyndrome(stringToVerify.substring(1, stringToVerify.length() - 1));
    }

}
