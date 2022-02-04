package intro;

public class Student {
    String name;
    int age;
    long phone;
static String course = "Android";
    public static void main(String[] args) {
        Student st1=new Student();
        System.out.println("Student 1 name is" +(st1.name ="Praveena"));
        System.out.println("Student 1 age is" +(st1.age =25));
        System.out.println("Student 1 phone is" +(st1.phone =9747799024l));
        System.out.println("Student 1 course is" +course);
        System.out.println("------------------------------------");

        Student st2=new Student();
        System.out.println("Student 2 name is" +(st2.name ="ram"));
        System.out.println("Student 2 age is" +(st2.age =25));
        System.out.println("Student 2 phone is" +(st2.phone =9747779024l));
        System.out.println("Student 2 course is" +(course ="Testing"));
        System.out.println("------------------------------------");
        Student st3=new Student();
        System.out.println("Student 3 name is" +(st3.name ="raju"));
        System.out.println("Student 3 age is" +(st3.age =25));
        System.out.println("Student 3 phone is" +(st3.phone =9999999024l));
        System.out.println("Student 3 course is" +course );
        System.out.println("------------------------------------");
    }
}
