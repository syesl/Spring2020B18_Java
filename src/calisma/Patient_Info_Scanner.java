package calisma;
import java.util.Scanner;

public class Patient_Info_Scanner {
    public static void main(String[] args) {



//Enter your code here
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");
            System.out.println("Enter your first name");
            String firstName = scan.nextLine();
            System.out.println("Enter your last name");
            String lastName = scan.nextLine();
            System.out.println("Enter your email");
            String email = scan.nextLine() ;
            System.out.println("Enter your street");
            String street =scan.nextLine();
            System.out.println("Enter your city");
            String city = scan.nextLine();
            System.out.println("Enter your state");
            String state = scan.nextLine();
            System.out.println("Enter your zipcode");
            int zipcode = scan.nextInt();
            System.out.println("Enter your work phone number");
            long workPhone = scan.nextLong();
            System.out.println("Enter your personal phone number");
            long phone = scan.nextLong();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your height");
            double height = scan.nextDouble();
            System.out.println("Enter your weight");
            double weight= scan.nextDouble();
            System.out.println("Are you married");
            boolean married = scan.nextBoolean();

            String contacts = "Contacts: work phone number -"+workPhone+", personal phone number -"+phone+", email:"+email;
            String fullName = "Full name: " +lastName+", "+firstName;
            String Address = "Address: "+street+" "+city+" "+state+" " +zipcode;
            System.out.println("Patient personal information");
            System.out.println(fullName);
            System.out.println(Address);
            System.out.println("Age: "+age);
            System.out.println("Height: "+ height);
            System.out.println("Weight: "+ weight);
            System.out.println("Married?: "+married);




            }
            }
