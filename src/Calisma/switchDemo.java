package Calisma;
// dallandirma yapalim.
//bir ogrenciye grade ine gore kaldin gectin yapalim.

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("pekiyi gectiniz");
                break;
            case 'B':
                System.out.println("iyi gectiniz");
                break;
            case 'C':
                System.out.println("orta ");
                break;
            case 'F':
                System.out.println("kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");


        }






        /* Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade = scan.nextInt();

        if (grade>90) {
            System.out.println("Your grade A");
        }
        else if (grade>80) {
            System.out.println("Your grade B");
        }
        else if (grade>70) {
            System.out.println("Your grade C");
        }
        else {
            System.out.println("Your grade F");
        } */


    }
}
