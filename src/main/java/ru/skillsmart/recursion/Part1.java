package ru.skillsmart.recursion;

public class Part1 {

    //возведение числа n в степень m
    public static int power(int n, int m) {
        if (m == 0)
            return 1;

        return n * power(n, m - 1);
    }

    //вычисление суммы цифр числа
    public static int sum(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sum(n / 10);
    }

}
