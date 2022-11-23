package com.boyko_anastasia;

public class DataTypes {
    public static void main(String[] args) {

        //Математические + - * / % ++ --
        byte a = -12;
        short b = 36;
        int c = -184;
        long d = 500L;
        double e = 245.8;

        System.out.println("a + b =" + (a + b));
        System.out.println("c - a =" + (c - a));
        System.out.println("c * d =" + (c * d));
        System.out.println("d / b =" + (d / b));
        System.out.println("d % b =" + (d % b));
        System.out.println("x =" + (a++));
        System.out.println("y =" + (++a));

        // Переполнение
        System.out.println((byte)(b * 200));

        // Комбинаций типов данных (int и double)
        System.out.println("c * e =" + (c * e));
        System.out.println("e / c =" + (e / c));
        System.out.println("e % c =" + (e % c));

    }
}
