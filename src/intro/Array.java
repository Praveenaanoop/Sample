package intro;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //accessed using index values
        //accessed using for loops
        // memory allocation new keyword is used
        // name of array should be in 
        String names[] = {"ram", "raj", "rahul", "rhino"};//single dimension array
        System.out.println(names[0]);
        int[] age = new int[5];
        age[0] = 10;
        age[1] = 12;
        age[4] = 99;
        //age[5]=66;
        // it will create exception and exit
       for (int index = 0; index < age.length; index++) {
           System.out.print(age[index] + " ");
       }
        //multidimensional array
        int[][] ag = new int[3][3];
        int a[][] = {{1, 2}, {3, 4}, {6, 7}};//value given representation
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                    System.out.print(ag[row][col]+" ");
                }

            }
        System.out.println();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter row and col size");
        int row= obj.nextInt();
        int col= obj.nextInt();
System.out.println("Enter "+(row*col)+ "array elements");
int b[][]=new int[row][col];
for(int r=0;r<row;r++){
    for(int c=0;c<col;c++){
        b[r][c]=obj.nextInt();
    }
}
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
               System.out.println(b[r][c]+" ");

            }
        }
        System.out.println();
        }

}
