package gr.aueb.cf.exercises.publicApi;

public class Main {

    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3, 6, 7);

        System.out.println(point.convertToString());

        System.out.println(point.getXZdistance());
        System.out.println(point.getYZdistance());
        System.out.println(point.getXYdistance());
        System.out.println(point.getXYZdistance());
    }

}
