package org.lakrista.chapter11;

import org.lakrista.StdDraw;
import org.lakrista.StdRandom;

/**
 * 1.1.31 Случайные соединения.
 * Напишите программу, которая принимает из командной строки в качестве аргументов целое N и значение p типа double
 * (между 0 до 1), вычерчивает N точек размера 0.05, равномерно распределенных по окружности, и затем вычерчивает
 * серые отрезки, соединяющие каждую пару точек с вероятностью p
 */
public class Exercise31 {

    public static void main(String[] args) {
        int n = 30;
        double p = 0.7;

        drawCircle(n, p);
    }

    private static void drawCircle(int n, double p) {
        StdDraw.setCanvasSize(350, 350);
        StdDraw.setScale(-1, 1);
        StdDraw.setPenRadius(0.05);

        double[][] dots = new double[n][2];
        for (int i = 0; i < n; i++) {
            dots[i][0] = Math.cos(2 * Math.PI * i / n);
            dots[i][1] = Math.sin(2 * Math.PI * i / n);
            StdDraw.point(dots[i][0], dots[i][1]);
        }

        StdDraw.setPenRadius();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                }
            }
        }
    }
}
