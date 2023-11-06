package ru.skillsmart.recursion;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class Part4 {

    //7. нахождение второго максимального числа в списке (с учётом, что максимальных может быть несколько, если они равны)
    public static <T extends Comparable<T>> T findSecondMaxValue(ArrayList<T> list) {
        T initialMaxValue = list.get(0);
        T initialSecondMaxValue = list.get(1);

        if (initialMaxValue.compareTo(initialSecondMaxValue) < 0) {
            T tempValue = initialMaxValue;
            initialMaxValue = initialSecondMaxValue;
            initialSecondMaxValue = tempValue;
        }

        return findValueRecursive(list, initialMaxValue, initialSecondMaxValue, 2);
    }

    private static <T extends Comparable<T>> T findValueRecursive(ArrayList<T> list, T maxValue, T secondMaxValue, int currentPosition) {
        if (currentPosition == list.size()) {
            return secondMaxValue;
        }
        T currentValue = list.get(currentPosition);

        if (currentValue.compareTo(maxValue) > 0) {
            secondMaxValue = maxValue;
            maxValue = currentValue;
        } else if (currentValue.compareTo(secondMaxValue) > 0) {
            secondMaxValue = currentValue;
        }
        return findValueRecursive(list, maxValue, secondMaxValue, ++currentPosition);
    }

    //8. поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности
//    public static LinkedList<File> findFiles(String directory, int deepnessToGo) {
//
//        LinkedList<File> filesList = new LinkedList<>();
//
//        return findFilesRecursive(directory, filesList, deepnessToGo);
//    }

    public static LinkedList<File> findFilesRecursive(String directory, LinkedList<File> filesList, int deepnessToGo) {

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
