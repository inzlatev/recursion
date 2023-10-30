package ru.skillsmart.recursion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.skillsmart.recursion.Part3.handleEvenIndexedElements;
import static ru.skillsmart.recursion.Part3.handleEvenValues;

public class Part3Test {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void evenValuesTest() {
        handleEvenValues(new LinkedList<>(Arrays.asList(1,2,3,4,5,6)));
        assertEquals("246", out.toString());
        out.reset();
        handleEvenValues(new LinkedList<>(Arrays.asList(1)));
        assertEquals("", out.toString());
        out.reset();
        handleEvenValues(new LinkedList<>(Arrays.asList(0)));
        assertEquals("0", out.toString());
        out.reset();
        handleEvenValues(new LinkedList<>());
        assertEquals("", out.toString());
    }

    @Test
    public void evenIndexTest() {
        handleEvenIndexedElements(new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7)));
        assertEquals("1357", out.toString());
        out.reset();
        handleEvenIndexedElements(new LinkedList<>(Arrays.asList(0)));
        assertEquals("0", out.toString());
        out.reset();
        handleEvenIndexedElements(new LinkedList<>());
        assertEquals("", out.toString());
    }

}
