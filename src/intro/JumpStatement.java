package intro;

import java.util.Scanner;

public class JumpStatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2==0)
            {
                System.out.println(i);

            }

        }
        // odd numbers using continue
        for(int i=1;i<=10;i++){
            if(i%2==0)
            {
                continue;
                //to skip all even numbers
            }
            System.out.println(i);
        }
        //break
        for(int i=1;i<=10;i++){
            if(i%4==0)
            {
                break;
            }
            System.out.println(i);
        }


        JumpStatement jump=new JumpStatement();
        int sum=jump.add();
        // storing the returned variable in another variable to print
        System.out.println(sum);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int c=scan.nextInt();
        System.out.println("Enter the second number");
        int d=scan.nextInt();
        jump.addi(c,d);


    }
// return statement to get local variable outside
    //default function without arguments
    int add(){
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;
    }


    //function with arguments
    void addi(int c ,int d){
        int sum=c+d;
        System.out.println( "The sum is" +sum);
    }
}
