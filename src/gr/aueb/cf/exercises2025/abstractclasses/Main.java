package gr.aueb.cf.exercises2025.abstractclasses;

import gr.aueb.cf.exercises2025.abstractclasses2.AbstractShape;
import gr.aueb.cf.exercises2025.abstractclasses2.IShape;
import gr.aueb.cf.exercises2025.abstractclasses2.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(7, 2);
        Line l1 = new Line(6);

        c1.setId(123423L);
        r1.setId(2L);
        l1.setId(3L);

        System.out.println(c1.getId());
        System.out.println(r1.getId());
        System.out.println(l1.getId());

        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
    }
}
