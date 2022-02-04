package intro;

public class Variables {

    void add(){
        int a=10;
        int b=20;
        int sum= a+b;
        System.out.println("The sum is " +sum);
    }
    // constructor
 public Variables(){
        String firstname="Praveena";
        String lastname="Anoop";
        System.out.println(firstname+lastname);

 }
    void sub(){
        int a=90;
        int b=32;
        int sub= a-b;
        System.out.println("Difference is :" +sub);
    }
    public static void main(String[] args) {
        Variables localvariables=new Variables();
        localvariables.add();
        localvariables.sub();
    }
}
