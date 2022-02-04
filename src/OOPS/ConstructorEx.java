package OOPS;

public class ConstructorEx{
//constructor overloading
    //default constructor


    public ConstructorEx() {
        this(56,89);//place as first statement. this keyword will invoke the parameterised function
        int sum=10+30;
        System.out.println("Sum is" +sum);
    }
//parameterised constructor
    public ConstructorEx(int a,int b){
        this("Anna",76);
        int sum=a+b;
        System.out.println(sum);
    }
    public ConstructorEx(String a,int b){

        System.out.println("My name is"+a+"my age is"+b);
    }

    public static void main(String[] args) {
        ConstructorEx obj=new ConstructorEx();
       // ConstructorEx obj1=new ConstructorEx(78,90);
       // ConstructorEx obj2=new ConstructorEx("renu",78);
    }

}
