package ru.skillsmart.recursion;

import java.util.LinkedList;

public class Part3 {

    //5. печать только чётных значений из списка
    public static void handleEvenValues(LinkedList<Integer> list) {
        printEvenValuesOnly(list, 0);
    }

    public static void printEvenValuesOnly(LinkedList<Integer> list, int index) {
        if (list.size() == index)
            return;

        Integer currentElement = list.get(index);
        if (currentElement % 2 == 0) {
            System.out.print(currentElement);
        }
        printEvenValuesOnly(list, ++index);
    }

    //6. печать элементов списка с чётными индексами
    public static <T> void handleEvenIndexedElements(LinkedList<T> list) {
        printEvenIndexedElementsOnly(list, 0);
    }

    public static <T> void printEvenIndexedElementsOnly(LinkedList<T> list, int index) {
        if (index >= list.size())
            return;

        System.out.print(list.get(index));
        printEvenIndexedElementsOnly(list, index + 2);
    }

}
