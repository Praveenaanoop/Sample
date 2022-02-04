package OOPS;

import intro.Student;

import java.util.Scanner;

public class StudentDetails {
    String name;
    int age;
    long phone;
    static String course = "Android";

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StudentDetails stu=new StudentDetails();
        for(int i=1;i<=2;i++){

            System.out.println("Enter the details");

            System.out.println("Enter your name");
            stu.name=obj.next();
            //to read a string next()is used
            System.out.println("Enter your age");
            stu.age=obj.nextInt();
            System.out.println("Enter your phone");
            stu.phone=obj.nextLong();


            System.out.println("Name=" +stu.name);
            System.out.println("Age=" +stu.age);
            System.out.println("Phone=" +stu.phone);
            System.out.println("Course=" +course);

        }





        }
}

