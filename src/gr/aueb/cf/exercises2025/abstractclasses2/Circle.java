package gr.aueb.cf.exercises2025.abstractclasses2;

public class Circle extends AbstractShape implements ICircle{

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return 3.14 *radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long)((long) 2 * 3.14 * radius);
    }
}
