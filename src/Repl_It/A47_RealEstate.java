package Repl_It;

import java.util.Scanner;

public class A47_RealEstate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        int price = 0;

        System.out.println("Enter your property type:");
        String house = scan.nextLine();

        if(house.equalsIgnoreCase("Condo")){
            price = 50000;
        } else if(house.equalsIgnoreCase("Townhouse")) {
            price = 75000;
        }else {
            price = 95000;
        }

        System.out.println("How many bedrooms do you have?");
        int Bedrooms = scan.nextInt();

        price += Bedrooms*30000;

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();
       if(backyard) {
         if(house.equalsIgnoreCase("Condo")) {
                System.out.println("Backyard is not available for condo!");
         } else {
                price += 5000;

            }
        }

        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();

        if(garage){
            System.out.println("How many spots?");
        }
        int garageS = scan.nextInt();

        if(garageS>=1 && garageS<=10) {
            price += garageS*20000;
        } else {
            System.out.println("Pardon, it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        float metro = scan.nextFloat();

        if(metro<=1) {
            price += 10000;
        }

        if(metro>1 && metro<=3) {
            price +=5000;
        }

        System.out.println("How close is highway?");
        float highway = scan.nextFloat();
        if(highway<=1) {
            price += 15000;
        }
        if(highway>1 && highway<=5) {
            price += 8000;
        }
        if(highway>5 && highway<=20) {
            price += 4000;
        }

        System.out.println("What's the rating of nearest school?");
        float school = scan.nextFloat();
        if(school<=10 && school>=8){
            price += 45000;
        } else if( school<8 && school>=4) {
            price += 20000;
        } else {
            price += 5000;
        }

        System.out.println("Does any of your family members smoking?");
        boolean smoking = scan.nextBoolean();

        if(smoking) {
            price -= 5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + price +"$");
    }
}




