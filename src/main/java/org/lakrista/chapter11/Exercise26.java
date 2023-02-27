package org.lakrista.chapter11;

/**
 * 1.1.26 Сортировка трех чисел
 * Допустим, переменные a, b, c и t имеют один и тот же числовой примитивный тип.
 * Покажите, что следующий код располагает значения a, b и c в порядке возрастания:
 * if (a > b) { t = a; a = b; b = t; }
 * if (a > c) { t = a; a = c; c = t; }
 * if (b > c) { t = b; b = c; c = t; }
 */
public class Exercise26 {

    public static void main(String[] args) {
        max(4, 7, 3, 1);
    }

    private static void max(int a, int b, int c, int t) {
        System.out.println("a=" + a + " b=" + b + " c=" + c + " t=" + t);
        int n = t;
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        System.out.println("t=" + n + " a=" + a + " b=" + b + " c=" + c);
    }
}
