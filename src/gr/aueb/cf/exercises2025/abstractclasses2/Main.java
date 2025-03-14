package gr.aueb.cf.exercises2025.abstractclasses2;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23, 45);
        Circle c1 = new Circle(4);
        Line l1 = new Line(8);

        r1.setId(234567);
        System.out.println(r1.getId());
        c1.setId(237);
        System.out.println(c1.getId());
        l1.setId(7);
        System.out.println(l1.getId());

        System.out.println("Circle area " + c1.getArea());
        System.out.println("Circle circumference " + c1.getCircumference());
        System.out.println("Rectangle area " + r1.getArea());
        System.out.println("Rectangle circumference " + r1.getCircumference());

        System.out.println("Circle diameter " + c1.getDiameter());
    }
}
