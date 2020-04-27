package Day11_Scanner;
import java.util.Scanner;


public class salaryCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);  // scanner object
        System.out.println("Enter your salary: ");
        int Salary = input.nextInt();
        System.out.println("Enter the state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter the federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0; // 10/3.0 ==> 3.3333

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary;


        //salaryAfterTax = Salary-totalTax
        double salaryAfterTax = Salary - totalTax;


        System.out.println("Your salary after tax is: " + salaryAfterTax);

        System.out.println("Total tax: " + totalTax);



    }


}


