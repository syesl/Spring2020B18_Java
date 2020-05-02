package Repl_It;
import java.util.Scanner;
public class R78CarInsurance {
    public static void main(String[] args) {

        double premium = 0;
        int age=0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        int sum = 0;
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        System.out.println("Do you have a US driver license?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else {
            System.out.println("What's your zipcode?");
            int zip = scan.nextInt();
            if (zip == 20910 || zip == 20740) {
                premium += 60;
            } else if (zip == 22102 || zip == 22103) {
                premium += 30;
            } else {
                premium += 50;
            }
        }

        System.out.println("Is this vehicle owned,financed,or leased?");
        if (vehicleOwnership.equalsIgnoreCase("owned")) {
            premium += 10;
        } else {
            premium += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        if (vehicleUsage.equalsIgnoreCase("business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            premium +=daysDrivenToWorkOrSchool*5;
            System.out.println("how many miles customers drives to work or school");
            System.out.println("Miles Driven To Work And/Or School");
            premium += milesToWorkOrSchool*1;
            System.out.println("How old are you?");
            if(age<16){
                System.out.println("Invalid data!");
                System.exit(0);
            }else if(age>16&& age<18){
premium *=20;
            }else if(age>18&& age<21) {
                premium *=6;
            }else if(age>21&& age<25){
                premium *=2;
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");


        }
    }

}


