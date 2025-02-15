package example;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(base.TestListener.class)
public class Test1 {
    @Test
    public void display(){
        System.out.println("This is a TestNG test method");
    }
}
