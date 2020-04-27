package Day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
String firstName = input.next();

        System.out.println("Enter last name : ");
        String lastName = input.next();
        String fullName = firstName+ " "+lastName;
        System.out.println(fullName);

        System.out.println("Are you employeed?");
        boolean employmentStatus = input.nextBoolean();
        System.out.println("Employeed: "+ employmentStatus);

        double salary=0;
        if(employmentStatus== true){
            System.out.println("Enter your salary: ");
            salary= input.nextDouble();
        }
        System.out.println("Full name is: "+ fullName);
        System.out.println("Employeed: "+ employmentStatus);
        System.out.println("Salary: "+salary);


        //float b=input.nextFloat();
        //System.out.println("Enter salary: ");








    }
}
