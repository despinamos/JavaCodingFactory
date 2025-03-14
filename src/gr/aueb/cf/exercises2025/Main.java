package gr.aueb.cf.exercises2025;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Lilly", 7);
        Animal dog = new Dog("Barry", 5);
        Animal cat = new Cat("Steve", 4);

        animal.speak();
        dog.speak();
        cat.speak();

        doSpeak(animal);
        doSpeak(dog);
        doSpeak(cat);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
