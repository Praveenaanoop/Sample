package OOPS;
//it is a type of data hiding, hiding essential details and showing the functionality
//two types - interface/abstract class (Abstract class classname)
// keyword Abstract is used in front of class and function
//abstract class cannot be instantiated= no object creation
//abstract class can only be used through inheritance
// there will be no body for abstract method
//abstract class will not provide 100% abstraction but interface do

 abstract class Bank1{
    String bankname;
    int nofbranch;
    int amount=10000;

    void deposit(int amount){
        System.out.println("Balance="+(amount+this.amount));
    }

    abstract void withdraw(int amount);// no body
}
// abstract function define
class SbiB extends Bank1{
// will work without super keyword
    int amount=20000;
    @Override
    void withdraw(int amount) {
        System.out.println("Balance="+(this.amount-amount));
    }
}

public class AbstractionMain {
    public static void main(String[] args) {
SbiB obj=new SbiB();
System.out.println("Bank is "+(obj.bankname="SBI Bank"));
System.out.println(obj.bankname+" has "+(obj.nofbranch=1)+"in kochi");
obj.deposit(3700);
obj.withdraw(400);
    }
}
