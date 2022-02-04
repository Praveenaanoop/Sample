package OOPS;

public class StaticEx {
    static void show(){
        System.out.println("inside show");
    }
    static {//will execute before main method
        System.out.println("inside static block");
    }

    public static void main(String[] args) {
        show();//because function is static
        System.out.println("inside main");
    }
}
//memory management-static