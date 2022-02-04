package intro;

import java.util.Scanner;

public class FiveDetails {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        for(int i=1;i<=5;i++){

            System.out.println("Enter the details");

            System.out.println("Enter your name");
            String name=obj.next();
            //to read a string next()is used
            System.out.println("Enter your age");
            int age=obj.nextInt();
            System.out.println("Enter your cgpa");
            float cgpa=obj.nextFloat();
            System.out.println("Enter your gender");
            char gender=obj.next().charAt(0);

            System.out.println("Name=" +name);
            System.out.println("Age=" +age);
            System.out.println("CGPA=" +cgpa);
            System.out.println("gender=" +gender);

        }
    }
}
