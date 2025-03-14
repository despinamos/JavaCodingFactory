package gr.aueb.cf.ch17.callbacks;

public class Main2 {

        public static void main(String[] args) {

            // method reference
            doPrint(Main2::sayHelloWorld);
            doPrint(Main2::sayHelloCoding);
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