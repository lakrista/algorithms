package org.lakrista.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.1.27 Биномиальное распределение.
 * Оцените количество рекурсивных вызовов, которое потребуется коду
 * public static double binomial(int N, int k, double p) {
 *   if(N == 0 && k == 0) return 1.0;
 *   if(N < 0 || k < 0) return 0.0;
 *   return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
 * }
 * для вычисления значения binomial(100, 50). Разработайте лучшую реализацию,
 * в которой вычисленные значения хранятся в массиве.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Double> it = new ArrayList<>();
        binomial(10, 5, 0.5, it);
        System.out.println(it);
        System.out.println(it.size());
    }

    public static double binomial(int N, int k, double p, List<Double> it) {
        if (N == 0 && k == 0) {
            it.add(1.0);
            return 1.0;
        }
        if (N < 0 || k < 0) {
            it.add(0.0);
            return 0.0;
        }
        double value = (1.0 - p) * binomial(N - 1, k, p, it) + p * binomial(N - 1, k - 1, p, it);
        it.add(value);
        return value;
    }
}
