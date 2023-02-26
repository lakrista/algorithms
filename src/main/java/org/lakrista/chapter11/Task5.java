package org.lakrista.chapter11;

import java.util.Arrays;

/**
 * 1.1.30 Работа с массивом.
 * Напишите фрагмент кода, который создает логический массив a[][] размером NxN - такой, что a[i][j] равно true,
 * если i и j взаимно просты (не имеют общего делителя), и false в противном случае
 */
public class Task5 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(hasCommonDivider(5)));
    }

    private static boolean[][] hasCommonDivider(int n) {
        boolean[][] array = new boolean[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (gcd(i, j) == 1) {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }
        return array;
    }

    private static int gcd(int n, int m) {
        if (m > n) return gcd(m, n);
        if (m == 0) return n;
        return gcd(m, n % m);
    }

}
