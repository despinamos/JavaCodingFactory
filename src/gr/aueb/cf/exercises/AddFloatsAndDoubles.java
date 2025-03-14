package gr.aueb.cf.exercises;

public class AddFloatsAndDoubles {
    public static void main(String[] args) {
        int intNum = 19;
        float floatNum = 0.1F;
        double doubleNum1 = 12.5;
        double doubleNum2 = 2D; //not necessary to add the D
        float floatResult = 0.0F;
        double doubleResult = 0.0;

        //smaller sized numbers become floats
        floatResult = floatNum + intNum;

        //if there is a double, floats and ints
        //become doubles
        doubleResult = doubleNum1 + floatNum * intNum;

        System.out.printf("floatResult = %f ", floatResult);
        System.out.printf("doubleResult = %f", doubleResult);
    }
}
