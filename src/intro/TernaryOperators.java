package intro;

public class TernaryOperators {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=40;
        int sum=a+b;
       // int result=a>b? a:b;
        int result= a>b? a:b;

// 3 numbers largest
        String larger= result>c ?result+"is larger": c+"is larger";
        System.out.println(larger);
        // 3 numbers smaller
        int less=a<b?a:b;
        String smaller= less<c?less+"is smaller":c+"is smaller";
        System.out.println(smaller);
//single line largest of 3 numbers
        int large=(a>b)?(a>c ?a:c):(b>c?b:c);
        System.out.println(large);
//single line smallest of 3 numbers
        int small=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println(small);
    }
}
