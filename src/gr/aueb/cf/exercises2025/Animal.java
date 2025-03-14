package gr.aueb.cf.exercises2025;

public class Animal {

    private String name;
    private int age;

    public Animal() {

    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am an Animal");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
