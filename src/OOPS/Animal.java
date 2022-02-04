package OOPS;

public class Animal {//parent
    // extends keyword is used to inherit features of a parent class by its child
    //common can be set in a parent class and inheritted
    String color="Black";
    void eat(){
        System.out.println("Most are non veg");
             }
             void vaccine(){
        System.out.println("Pets should be vaccinated");
             }

}
//child 1 class
//single inheritance one parent with one child
class Dog extends Animal{ //inheritance
 String breed="Lab";
 void sound(){
     System.out.println(breed+" is Barking");
 }


}
//child 2 hierarchial 1 parent more than 1 child(no relation between the children)
class Cat extends Animal{
    String breed="Persian Cat";
    void age(){
        System.out.println("My pet"+breed+"is 1 year old");
    }
}
class Main{
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println("My pet is a dog and its"+dog.breed);
        System.out.println("My lab is "+dog.color);
        dog.sound();
        dog.eat();
        System.out.println("-----------------------");
        Cat cat=new Cat();
        System.out.println("My pet is a cat and is"+cat.breed);
        cat.age();
        System.out.println("My pet color is" +cat.color);
    }
}

