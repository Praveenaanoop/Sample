package OOPS;
interface Mother{
    String color="fair";
    String name="Amma";
    void looks();
    void detailsM(String job, int age, String bgrp);
}
interface Father{
    String name="Acha";
    String gestures="gestures with hands";
    void gesture();
    void detailsF(String job, int age, String bgrp);
}
public class MultipleInheritance implements Mother,Father{

    @Override
    public void looks() {
        System.out.println("All my look is"+color);

    }

    @Override
    public void detailsM(String job, int age, String bgrp) {
        System.out.println("Mothers name is "+Mother.name);
        System.out.println("Job       "+job);
        System.out.println("age         "+age);
        System.out.println("Blood group "+bgrp);
    }

    @Override
    public void gesture() {
        System.out.println("All my gesture is"+gestures);
    }

    @Override
    public void detailsF(String job, int age, String bgrp) {
        System.out.println("Fathers name is "+Father.name);
        System.out.println("Job       "+job);
        System.out.println("age         "+age);
        System.out.println("Blood group "+bgrp);
    }



}
class child2 implements Mother,Father{

    @Override
    public void looks() {
        System.out.println("All my look is"+color);

    }

    @Override
    public void detailsM(String job, int age, String bgrp) {
        System.out.println("Mothers name is "+Mother.name);
        System.out.println("Job       "+job);
        System.out.println("age         "+age);
        System.out.println("Blood group "+bgrp);
    }

    @Override
    public void gesture() {
        System.out.println("All my gesture is"+gestures);
    }

    @Override
    public void detailsF(String job, int age, String bgrp) {
        System.out.println("Fathers name is "+Father.name);
        System.out.println("Job       "+job);
        System.out.println("age         "+age);
        System.out.println("Blood group "+bgrp);
    }


    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.gesture();
        obj.looks();
        obj.detailsF("Farmer",27,"AB+");
        obj.detailsM("Tailor",23,"AB-");

        child2 child=new child2();
        child.detailsF("Farmer",27,"AB+");
        child.detailsM("Tailor",23,"AB-");

    }

}
