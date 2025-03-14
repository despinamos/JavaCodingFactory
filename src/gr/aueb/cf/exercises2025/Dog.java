package gr.aueb.cf.exercises2025;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog");;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
