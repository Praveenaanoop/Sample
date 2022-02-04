package intro;

public class Iterators {
    public static void main(String[] args) {

        //for loop
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
        }
       //while loop
        int y=1;
        while(y<=10)
        {
            System.out.println(y);
            y++;
        }

        //do while loop
        int x=1;
        do{
            System.out.println(x);
            x++;
        }while (x<=10);

        int z=10;
        do{
            System.out.println(z);
            z--;
        }while (z>=1);
    }
}
