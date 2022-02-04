package OOPS;
class Parent{
    void add(int a, int b){
        System.out.println("Sum is"+(a+b));
    }
    void show(){
        System.out.println("Inside show method from parent class");
    }
}
public class MethodOverriding extends Parent {
    @Override
    void add(int a, int b) {
        System.out.println("Sum is"+(a+b));
        super.add(3444,455);
        super.show();
        //super keyword is used to invoke functions of parent class which is either overrided/not from function of a child
    }

    public static void main(String[] args) {
        MethodOverriding mts=new MethodOverriding();
        mts.add(10,20);
    }
}
