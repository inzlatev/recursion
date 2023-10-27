package ru.skillsmart.recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skillsmart.recursion.Part2.*;

public class Part2Test {

    @Test
    @SuppressWarnings("unchecked")
    public void checkListLength() {
        LinkedList list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        assertEquals(6,listLength(list1));

        LinkedList list2 = new LinkedList<>(Arrays.asList('a','b','c','d'));
        assertEquals(4,listLength(list2));
    }

    @Test
    public void checkPalyndrome() {
       String positive1 = "Sator Arepo Tenet Opera Rotas";
       assertTrue(handlePalyndrome(positive1));
       String positive2 = "!!!";
       assertTrue(handlePalyndrome(positive2));

       String negative1 = "ABCDBCDA";
       assertFalse(handlePalyndrome(negative1));
       String negative2 = "!?";
       assertFalse(handlePalyndrome(negative2));
    }

}
