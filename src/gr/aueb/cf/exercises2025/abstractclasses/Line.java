package gr.aueb.cf.exercises2025.abstractclasses;

public class Line extends AbstractShape{

    private double length;

    public Line() {

    }

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }
}
