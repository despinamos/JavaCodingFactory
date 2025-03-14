package gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D() {
        //super(); // calls default constructor of the super class.
        //y = 0;
        //both of the previous lines
        //are automatically called by jvm
    }

    public Point2D(double x, double y) {
        super(x); // Calls overloaded constructor of Point.
        //setX(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String pointToString() {
        return super.pointToString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
