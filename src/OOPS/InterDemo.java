package OOPS;

// interface can only have abstract functions and final variable(constant)
//instead of extends implements is used
// class extends class(CKP)
// class implements interface(CKP)
// interface extends interface(CKP)
// class implements interface1,2....(CKP)
interface Myinter1{
    String datainter="This is a message interface";

    void show();//no body
}
interface inter2{
    void display();
}
//by separating using , many interfaces can be implemented in class
class BD implements Myinter1,inter2{

    @Override
    public void show() {
        System.out.println("Show method from B"+datainter);
    }

    @Override
    public void display() {
System.out.println("Display method");
    }
}
public class InterDemo extends BD{
    public static void main(String[] args) {
        InterDemo obj=new InterDemo();
        obj.display();
        obj.show();

    }
}
