package example;

import org.testng.annotations.Listeners;

@Listeners(base.TestListener.class)
public class Test {

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
