package gr.aueb.cf.ch14.model;

import java.util.Random;

/**
 * Constructor is private, but
 * it can be called through the function.
 */

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(10) + 1, random.nextInt(10) + 1);
    }
}
