package Calisma;

import java.util.Scanner;

public class BasHarfCalismasi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adiniz: ");

        String ad = scan.next();
        System.out.println("Soyadiniz: ");

        String sad = scan.next();
        System.out.println("Bas harfleriniz:" + ad.toUpperCase().charAt(0) + sad.toUpperCase().charAt(0));
    }

}
