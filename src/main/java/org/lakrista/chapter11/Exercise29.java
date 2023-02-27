package org.lakrista.chapter11;

import java.util.Arrays;


/**
 * 1.1.29 Равные ключи.
 * Добавьте в программу BinarySearch статический метод rank(), который принимает в качестве аргументов ключ
 * и упорядоченный массив целочисленных значений (которые могут повторяться) и возвращает количество элементов,
 * меньших ключа. Добавьте также аналогичный метод count(), который подсчитывает количество элементов, равных нулю.
 * Примечание: если i и j - значения, возвращенные вызовами rank(key, a) и count(key, a) соответственно,
 * то a[i..i+j-1] - значения в массиве, равные key.
 */
public class Exercise29 {

    public static void main(String[] args) {
        int[] whitelist = {1, 5, 4, 3, 6, 8, 5, 0, 9, 10, 7, 0, 4};
        Arrays.sort(whitelist);

        int key = 8;
        int rank = rank(key, whitelist);

        if (rank(key, whitelist) > 0) System.out.println(key + " with rank=" + rank);
        System.out.println(key + " with count=" + count(key,whitelist));
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            else return (int) Arrays.stream(a).filter(el -> el < mid).count();
        }
        return -1;
    }

    public static int count(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            else return (int) Arrays.stream(a).filter(el -> el == 0 && el < mid).count();
        }
        return -1;
    }
}
