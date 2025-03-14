package gr.aueb.cf.ch14.services;

import javax.print.DocFlavor;

/**
 *This class only creates one instance.
 * Static fields can only call static methods.
 * Non-static can call non-static but also static.
 */

public class CodingFactorySingleton {
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
