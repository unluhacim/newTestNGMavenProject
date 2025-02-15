package example;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(base.TestListener.class)
public class ExceptionEx1 {


    @Test
    public void addition(){
        int a=5;
        int b=0;

        for(int i=1;i<=2;i++) {
            try {
                int c = a / b;
                System.out.println("c= "+c);
                break;
            } catch (RuntimeException e) {
                System.out.println("Element is stale. retrying.."+" Run="+i);
                if(i==2) {
                    throw new RuntimeException("Test Failed:Stale element exception.");
                }

            }

        }

    }
}
