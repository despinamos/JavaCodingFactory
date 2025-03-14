package gr.aueb.cf.exercises2025.abstractclasses;

public class Rectangle extends AbstractShape implements ITwoDimensional{

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        return this.width * this.height;
    }
}
