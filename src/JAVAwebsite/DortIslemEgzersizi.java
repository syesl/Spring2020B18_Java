package JAVAwebsite;

import java.util.Scanner;

/*
 Write a Java program to print the sum (addition), multiply,
 subtract, divide and remainder of two numbers.
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5    */
public class DortIslemEgzersizi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number?");
        int first= scan.nextInt();
        System.out.println("Second number?");
        int sec= scan.nextInt();
        System.out.println(first+"+"+sec+" = "+(first+sec));
        System.out.println(first+"-"+sec+" = "+(first-sec));
        System.out.println(first+"*"+sec+" = "+(first*sec));
        System.out.println(first+"/"+sec+" = "+(first/sec));
        System.out.println(first+"%"+sec+" = "+(first%sec));

        System.out.println("Enter a number");
        int num = scan.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }







    }

}
