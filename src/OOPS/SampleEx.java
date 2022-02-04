package OOPS;
class A{
    A(int a){
        System.out.println("A class has a constructor");
    }
        }
public class SampleEx extends A{
SampleEx(int a){
    super(78);//if constructor is not default
    System.out.println("child default constructor");
}

    public static void main(String[] args) {
        SampleEx obj=new SampleEx(1);
        //on object creation constructor is invoked if it is default that is without parameter
    }
}
//inheritance prevention final in class is used
//final-keyword
//finally-block
//finalise-function