package Day14_StringContinue;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "I like to learn Java. I like to watch the movie Jumanji";
        int a1 = str.indexOf("J");
        System.out.println(a1);
        int a2= str.indexOf("Jum");
        System.out.println(a2);
        int a3 = str.indexOf(" I");
        System.out.println(a3);
        System.out.println("===========================");

        String s = " I like Java, and I like reading";
        int b1 = s.lastIndexOf("I");
        System.out.println(b1);
        int b2 = s.lastIndexOf("l");
        System.out.println(b2);

        String z= "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C#");
        System.out.println(c1);
        String x = "I like Java, Java is fun, Java programming is fun";
        int d1= x.indexOf("Java is");
        System.out.println(d1);
        int d2 =x.indexOf(", J")+2;

        System.out.println(d2);
        int d3 = x.indexOf("Java p");
        System.out.println(d3);
        char ch1 = x.charAt(26);
        System.out.println(ch1);

    }
}
