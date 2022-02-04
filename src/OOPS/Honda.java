
// Super
package OOPS;
class Car{
    String color="Black";
    void milage(){
        System.out.println("14.5km/ltr");
    }
}
public class Honda extends Car {
    String color="Red";
// can access data from parent class using super keyword
    @Override
    void milage() {
        System.out.println("My favourite color is"+super.color);
        super.milage();
    }
// cannot call super from main method because it is static
    public static void main(String[] args) {
        Honda obj=new Honda();
        System.out.println(obj.color+"is a common color");
        obj.milage();
    }
}
