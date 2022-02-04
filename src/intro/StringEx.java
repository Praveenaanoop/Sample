package intro;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringEx {
    public static void main(String[] args) {
        String name1=new String("Narayanan");
        //new keyword will allocate new memory location even if it is of same value

char[] c= {'h','e','l','l','o'};//using character array
System.out.println(c);

        String name="Hari";
        //literal (same value refers to the same memory location)(inside String constant pool inside the heap)


        String nam=name.concat(name1); //needed to create a new string
        StringBuffer name2=new StringBuffer("Anu");
        name2.append(name1);//direct modification only in buffer or builder
        System.out.println(name2);
        System.out.println(nam);


        String s1="Hello";
        String s2="Hello";
        String s3="hello";
        String s4=new String("Hello");
        // checks only case sensitivity and length in .equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

        // when we are checking with == it will check case sensitivity,memory location, length

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.length());//for printing string lengh
        System.out.println(s1.replace('l','m'));
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase(Locale.ROOT));

        System.out.println(s1.codePointAt(2));//gives aski value at that particular index
        System.out.println(s1.codePointAt(0));//gives aski value at that particular index
        System.out.println(s3.codePointAt(0));//gives aski value at that particular index

        System.out.println(s1.compareTo(s3));// 72-104(codepoint values)
        System.out.println(s3.compareTo(s1));// 104-72 (codepoint values) comparing aski values
        // it will fetch the first difference and then it will print, if it is same then compare to the next value


        StringTokenizer obj = new StringTokenizer("Hai All welcome to the, world of logic",",");
        //splitting a long string int o small tockens then it is called string tockenizer;
        //delimiter is space commonly or , or letter etc
        // by default delim will be space

        while (obj.hasMoreTokens()){  //will split according to delim
            System.out.println(obj.nextToken());

        }
            String s="Hai all welcometo java";
            String data[]= s.split(" ");
            for (String d:data){
                System.out.println(d);
            }


    }
}
