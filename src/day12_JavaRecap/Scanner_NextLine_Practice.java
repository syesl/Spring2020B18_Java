package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //7925 jonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-number Street,c city, state zipcode
        System.out.println("Building number: ");
    int Bnumber = input.nextInt(); //7925Enter enter left after that

        input.nextLine(); // used for taking out the enter from scanner


        System.out.println("Street name: ");
        String street =input.nextLine();

        System.out.println("City: ");
        String city = input.nextLine();

        System.out.println("State: ");
        String state = input.nextLine();

        System.out.println("Enter the zip code: ");
        int zipcode = input.nextInt(); //22034

        input.nextLine();
        System.out.println("enter the city name and seperated by comma and space");

        String fullAddress = Bnumber + " " + street+ " " + city +state + zipcode;







    }





}
