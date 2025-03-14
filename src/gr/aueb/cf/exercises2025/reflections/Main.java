package gr.aueb.cf.exercises2025.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Student.class; // instance of the translated file
        Class<?> aClass = Class.forName("gr.aueb.cf.exercises2025.reflections.Student");

        Constructor<?>[] publicConstructors = Student.class.getConstructors();
        Constructor<?>[] constructorsList = Student.class.getDeclaredConstructors();

        Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();
        defaultConstructor.setAccessible(true);

        Student student = (Student) defaultConstructor.newInstance(); // create Student instance with default constructor
    }
}
