package gr.aueb.cf.exercises2025.abstractclasses;

public class Circle extends AbstractShape implements ITwoDimensional{

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
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public double getArea() {
        return 3.14*this.radius*this.radius;
    }
}
