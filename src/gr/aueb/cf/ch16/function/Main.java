package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {
        AdditionCalculator addition = new AdditionCalculator();
        ICalculator addition2 = new AdditionCalculator();
        int result = addition.operate(2, 3);
        int result2 = addition2.operate(4, 3);
        System.out.println(result);
        System.out.println(result2);

        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int resultSub = sub.operate(10, 6);
        System.out.println(resultSub);

        ICalculator mul = (a, b) -> a * b;
        int resultMul = mul.operate(2, 7);
        System.out.println(resultMul);
    }
}
