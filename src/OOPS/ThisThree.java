package OOPS;

public class ThisThree {
    String name;
    int age;
    long phone;

    public ThisThree(String name, int age, long phone) {
        this.name=name;
        this.age=age;
        this.phone=phone;
        //if arguments name and instance variable name are same to specify each we use this keyword
    }
     void display(){
        System.out.println("Student name" +name);
        System.out.println("Student age" +age);
        System.out.println("Student phone" +phone);
     }

    public static void main(String[] args) {
        ThisThree obj=new ThisThree("anu",23,891578764);
        obj.display();
    }
}
