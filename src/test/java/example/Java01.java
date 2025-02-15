package example;

public class Java01 {
String a;

public Java01(){
    System.out.println("This is a default constructor");
}

public Java01(String a){
    this();
    this.a=a;
    System.out.println("This is a parameterized constructor and a= "+this.a);
}

public String display(String a){
    this.a=a;
    return a;

}

    public static void main(String[] args) {
        Java01 obj=new Java01("Bob");
        System.out.println(obj.a);
        String name=obj.display("Emel");
        System.out.println(name);

    }
}
