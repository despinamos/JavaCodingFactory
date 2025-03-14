package gr.aueb.cf.ch17.callbacks;

public class Main {

    public static void main(String[] args) {
        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello Coding Factory!");
            }
        });

        // left -> input params
        // right -> callbacks
        doPrint(() -> System.out.println("Hello"));

        doPrint(() -> sayHelloWorld());
        doPrint(() -> sayHelloCoding());
    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
