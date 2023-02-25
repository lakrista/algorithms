package org.lakrista.chapter11;

import java.util.Arrays;

/**
 * 1.1.28 Удаление дубликатов.
 * Измените клиент тестирования в программе BinarySearch, чтобы после сортировки
 * белого списка из него удалялись все повторяющиеся ключи
 */
public class Task3 {

    public static void main(String[] args) {
        int[] whitelist = {1, 5, 4, 3, 6, 8, 5};
        Arrays.sort(whitelist);

        int key = 8;
        int rank = rank(key, Arrays.stream(whitelist).distinct().toArray());

        if (rank(key, whitelist) > 0) System.out.println(key + " with rank=" + rank);
    }

    public static int rank(int key, int[] a) {
       int lo = 0;
       int hi = a.length - 1;
       while (lo <= hi) {
           int mid = lo + (hi - lo) / 2;
           if (key < a[mid]) hi = mid - 1;
           if (key > a[mid]) lo = mid + 1;
           else return mid;
       }
       return -1;
    }
}
