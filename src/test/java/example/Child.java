package example;

public class Child extends Overriding01 {
    void show(){
        System.out.println(super.str);
        System.out.println("In child class");
    }

    public static void main(String[]args){
        Overriding01 obj=new Child();
        System.out.println(obj.str);
        obj.display();
        obj.show();
    }
}
