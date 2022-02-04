package OOPS;
// also known as compile time polymorphism
public class MethodOverloading {
    //default function
    void add(){
        int a=10;
        int b=30;
        System.out.println("Sum is"+(a+b));
    }
    //parameterised function
    void add(int a,int b){
        System.out.println("Sum is"+(a+b));
    }
    //number of arguments and datatype needs to be different in method overloading
    void add(int a, String b){
        System.out.println("My name is"+b+ "and my age is"+a);
    }
    public static void main(String[] args) {
        MethodOverloading met=new MethodOverloading();
        met.add();
        met.add(10,56);
        met.add(23,"geetha");
    }
}
