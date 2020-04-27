package Day11_Scanner;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //long a= 999999999L;
        // int a=99999999;
        System.out.println("Enter long number: ");

        long a =(int) input.nextLong();
        System.out.println("You have entered : "+a);

        System.out.println("Enter a decimal: ");

        float b=input.nextFloat();
        System.out.println("You have entered: " +b);








    }
}
