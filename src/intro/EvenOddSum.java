package intro;

public class EvenOddSum {
    public static void main(String[] args) {
        int esum=0;
        int osum=0;
        for(int i=0;i<=20;i++)
        {
            if(i%2==0){
                esum=esum+i;

            }
            if(i%2!=0)
            {
                osum=osum+i;
            }
        }
        System.out.println("Sum of even numbers is"+esum);
        System.out.println("Sum of odd numbers is"+osum);
    }
}
