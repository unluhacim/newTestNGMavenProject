package example;

public class Java04 extends Java03{


    public Java04(){
        super("This is a parent class constructor");
        System.out.println("This is child class constructor");
        //System.out.println(super.str);
    }


    public static void main(String[] args) {
        Java04 obj=new Java04();


    }

}




