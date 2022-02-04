package OOPS;

import java.util.Scanner;

public class Bank {
    void deposit( int damt){

    }
    void balancecheck(int bal){

    }
    void withdraw(int wamt){

    }
}
class Federal extends Bank{
    int bal=50000;
    @Override
    void deposit(int damt) {
        System.out.println("Your balance after deposit is"+(bal+damt));
    }

    @Override
    void balancecheck(int bal) {
        System.out.println("Your Balance is"+bal);
    }

    @Override
    void withdraw(int wamt) {
        System.out.println("The withdrawn amount is"+wamt);
        System.out.println("Your balance after withdrawal is"+(bal-wamt));
    }
}
class Sbi extends Bank{
    int bal=30000;
    @Override

    void deposit(int damt) {
        System.out.println("Your balance after deposit is"+(bal+damt));
    }

    @Override
    void balancecheck(int bal) {
        System.out.println("Your Balance is"+bal);
    }

    @Override
    void withdraw(int wamt) {
        System.out.println("The withdrawn amount is"+wamt);
        System.out.println("Your balance after withdrawal is"+(bal-wamt));
    }
}
class Mainn{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount to deposit at SBI");
        int damount=scan.nextInt();
        Sbi sbi=new Sbi();
        sbi.deposit(damount);
        System.out.println("Your SBI Balance is" +sbi.bal);
        System.out.println("Enter the amount to withdraw at SBI");
        int wamount=scan.nextInt();
        sbi.withdraw(wamount);
        Federal federal=new Federal();
        System.out.println("Enter the amount to deposit at Federal");
        int fdamount=scan.nextInt();
        federal.deposit(fdamount);
        System.out.println("Your Federal Balance is" +federal.bal);
        System.out.println("Enter the amount to withdraw at Federal");
        int fwamount=scan.nextInt();
        federal.withdraw(fwamount);
    }
}

