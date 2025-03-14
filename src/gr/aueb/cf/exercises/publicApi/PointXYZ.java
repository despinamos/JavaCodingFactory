package gr.aueb.cf.exercises.publicApi;

/**
 * Defines a {@link PointXYZ} class.
 */

public class PointXYZ {

    private double x;
    private double y;
    private double z;

    public PointXYZ() {

    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String convertToString() {
        return  "(x: " + x + ", " + "y: " + y + ", " + "z: " + z + ")";
    }

    /**
     * Returns the distance between X, Y.
     * @return the square root of the addition of the second power of x, y.
     */
    public double getXYdistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Returns the distance between Y, Z.
     * @return the square root of the addition of the second power of y, z.
     */
    public double getYZdistance() {
        return Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2));
    }

    /**
     * Returns the distance between X, Z.
     * @return the square root of the addition of the second power of x, z.
     */
    public double getXZdistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2));
    }

    /**
     * Returns the distance between X, Y, Z and the point of origin (0,0,0).
     * @return the square root of the addition of the second power of x, y, z.
     */
    public double getXYZdistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }


}
