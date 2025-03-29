package gr.aueb.cf.exercises2025.testing;

public class Sample {
    public Sample() {
        System.out.print("Ctr 1");
    }

    public Sample(int num) {
        int num1 = 2;
        int num2;
        num2 = num1 + num;
        System.out.println("Ctr 2 " + num2);
    }
}
