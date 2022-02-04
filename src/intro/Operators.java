package intro;

public class Operators {

    public static void main(String[] args) {
int a=10;
int b=20;
System.out.println("a+b = " +(a+b));
System.out.println("a-b = " +(a-b));
System.out.println("a*b = " +(a*b));
System.out.println("a/b = " +(a/b));
System.out.println("a%b = " +(a%b));

//relational

        System.out.println("a==b = " +(a==b));
        System.out.println("a>=b = " +(a>=b));
        System.out.println("a<=b = " +(a<=b));
        System.out.println("a>b = " +(a>b));
        System.out.println("a<b = " +(a<b));
        System.out.println("a!=b = " +(a!=b));


        //unary operators
        System.out.println("a-- = "+(a--));
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(++a);

        //assignment operator

        System.out.println(a=b);
        System.out.println(a+=b);
        System.out.println(a-=b);

        //logical operators
            //and operator
        int username=234;
        int password=000;
        System.out.println(username==234 && password==000);

        int age=18;
        System.out.println(age==18 && age>=18);
            //or operator
            System.out.println(age!=18 ||age>=18);

            //binary
            int x=10; // 0000 1010
            int y=7; // 0000 0111
               // x & y=0000 0010
               // x | y=0000 1111
        //x ^y=0000 1101
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);

        //shift operators
        int z=13;
        System.out.println(z >>2);//0000 1101 => 0000 0011
        System.out.println(z <<2);//0000 1101 => 0011 0100

        //ternary operators

        //condition? truestatement :false statement;
        int age1=20;
        String result=age1>=18? "Eligible" :"Not eligible";
        System.out.println(result);
    }
}
