package example;

public class Puppy extends Dog {
    public void eat(){
        System.out.println("Puppy eats meat");
    }

    void color(){
        System.out.println("Puppy is white");
    }

    void display(){
        System.out.println("Puppy is beautiful");
    }

    public static void main(String[] args) {
        Puppy obj=new Puppy();
        obj.color();
        obj.eat();
        obj.display();
        obj.sound();
    }
}
