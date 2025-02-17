package example;

abstract class Dog implements Mamal {
    public void sound(){
        System.out.println("Dog barks");
    }
    abstract void color();
}
