package OOPS;

public class ThisEx {
    void show(){
        this.display();
        System.out.println("Inside show");
        this.add();
    }
    void display(){
        this.show();
        System.out.println("Inside display");
    }
    void add(){
        this.show();
        System.out.println("Sum="+(23+56));
    }
    void add(int a,int b){
        this.show();
        System.out.println("Sum="+(a+b));
    }

    public static void main(String[] args) {
        ThisEx obj=new ThisEx();
        obj.display();
    }
}
