package OOPS;
//multilevel inheritance with connection of 3
public class Dogg {
    String pets="Dog";
    void food(){
        System.out.println("Dogs eat non veg");
    }
}
class Lab extends Dogg
{
    String breed="Lab";
    void age(){
        System.out.println("My"+breed +"is 1");
    }
}
class Labpuppy extends Lab{
    String name="popy";
    void drink(){
        System.out.println("My" +name+"drinks milk");
    }

    public static void main(String[] args) {
        Labpuppy lpupy=new Labpuppy();
        System.out.println("I have a pet she is"+lpupy.pets +"it is"+lpupy.breed);
        System.out.println(lpupy.breed+"have a baby as name"+lpupy.name);
        lpupy.food();
        lpupy.age();
        lpupy.drink();
    }
}
//hybrid inheritance = combination of other inheritance