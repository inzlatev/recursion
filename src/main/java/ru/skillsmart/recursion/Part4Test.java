package ru.skillsmart.recursion;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skillsmart.recursion.Part4.*;

public class Part4Test {

    @Test
    public void checkFindSecondMaxValue() {
        assertEquals(5, findSecondMaxValue(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6))));
        assertEquals(5, findSecondMaxValue(new ArrayList<>(List.of(1, 2, 3, 4, 5, 5))));
        assertEquals(5, findSecondMaxValue(new ArrayList<>(List.of(5, 5, 4, 3, 2, 1))));
        assertEquals(5, findSecondMaxValue(new ArrayList<>(List.of(6, 5, 4, 3, 2, 1))));
        assertEquals(1, findSecondMaxValue(new ArrayList<>(List.of(-6, -5, 4, -3, -2, 1))));
    }

    @Test
    public void checkFindFiles() {
        String directory = "C:\\Windows";

        LinkedList<File> files0 = findFilesRecursive(directory, new LinkedList<>(), 0);
        LinkedList<File> files1 = findFilesRecursive(directory, new LinkedList<>(), 1);
        assertTrue(files1.size() > files0.size());
        File fileInRoot = new File("C:\\Windows\\notepad.exe");
        File fileInFolder = new File("C:\\Windows\\Logs\\StorGroupPolicy.log");
        File fileDeep = new File("C:\\Windows\\Logs\\NetSetup\\service.0.etl");

        assertTrue(files0.contains(fileInRoot));
        assertFalse(files0.containsAll(List.of(fileInFolder, fileDeep)));
        assertTrue(files1.containsAll(List.of(fileInRoot, fileInFolder)));
        assertFalse(files1.contains(fileDeep));
    }

}
