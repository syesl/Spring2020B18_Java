package JAVAwebsite;
import java.util.Scanner;

public class JAVAyazmak {
    public static void main(String[] args) {
        System.out.println("   J    A   V     V  A    ");
        System.out.println("   J   A  A  V   V  A A   ");
        System.out.println("J  J  AAAAAA  V V  AAAAA  ");
        System.out.println(" JJ  A      A  V  A     A ");
        System.out.println("===============================");

        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        System.out.println("============================");
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println("============================");

        double radius=7.5;
        double pi = 3.14159;
        double perimeter = 2* pi * radius;
        double area= pi* radius*radius;
        System.out.println("Perimeter is =" + perimeter);
        System.out.println("Area is =" +area);
        System.out.println("============================");
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = scan.nextInt();
        System.out.println("enter second number");
        int n2 = scan.nextInt();
        System.out.println("enter third number");
        int n3 = scan.nextInt();
        int average = (n1+n2+n3)/3;
        System.out.println("Average of 3 numbers is " + average);



    }
}
