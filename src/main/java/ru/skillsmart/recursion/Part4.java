package ru.skillsmart.recursion;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class Part4 {

    //7. нахождение второго максимального числа в списке (с учётом, что максимальных может быть несколько, если они равны)
    public static int findSecondMaxValue(ArrayList<Integer> list) {
        int initialMaxValue = list.get(0);
        return findValueRecursive(list, initialMaxValue, Integer.MIN_VALUE, 1);
    }

    private static int findValueRecursive(ArrayList<Integer> list, int maxValue, int secondMaxValue, int currentPosition) {
        if (currentPosition == list.size()) {
            return secondMaxValue;
        }
        int currentValue = list.get(currentPosition);

        if (currentValue > maxValue) {
            secondMaxValue = maxValue;
            maxValue = currentValue;
        } else if (currentValue > secondMaxValue) {
            secondMaxValue = currentValue;
        }
        return findValueRecursive(list, maxValue, secondMaxValue, ++currentPosition);
    }

    //8. поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности
    public static LinkedList<File> findFiles(String directory, int deepnessToGo) {

        LinkedList<File> filesList = new LinkedList<>();

        return findFilesRecursive(directory, filesList, deepnessToGo);
    }

    private static LinkedList<File> findFilesRecursive(String directory, LinkedList<File> filesList, int deepnessToGo) {

        File fileDirectory = new File(directory);
        File[] files = fileDirectory.listFiles();

        if (files == null) {
            System.err.println("Нет доступа к директории " + fileDirectory);
        } else {
            for (File file : files) {
                if (file.isFile()) {
                    filesList.add(file);
                } else if (deepnessToGo > 0) {
                    findFilesRecursive(file.getAbsolutePath(), filesList, deepnessToGo - 1);
                }
            }
        }

        return filesList;
    }


}
