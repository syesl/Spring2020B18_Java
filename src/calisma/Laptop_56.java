package calisma;
import java.util.Scanner;
public class Laptop_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String storagetype,screenType,acpu;
        int price=0;
        System.out.println("Select screen size:");
        Float screen = scan.nextFloat();
        if (screen.equals(13.3)){
            price +=200;
        }if(screen.equals(15.0)){
            price +=300;
        }if(screen.equals(17.3)){
            price +=400;
        }
        System.out.println("Select CPU type:");
        String cpu = scan.next();
        if (cpu.equalsIgnoreCase("i3")){
            price +=150;
        }if(cpu.equalsIgnoreCase("i5")){
            price +=250;
        }
        if (cpu.equalsIgnoreCase("i7")) {
            price +=350;
        }
        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        int ram1=ram/4;
        price +=ram1*50;
        System.out.println("Enter memory size:");
        int size= scan.nextInt();
        if (size==1000){
            price +=200;
        }if (size==500){
            price +=100;
        }
        System.out.println("Select storage type:");
        String storage = scan.next();
        if(storage.equals("HDD")||storage.equals("hdd")){
            price +=(size/500)*50;
        }   if (storage.equals("ssd")|| storage.equals("SSD")){
                price += (size/500)*100;
        }

        System.out.println("Enter screen resolution:");
        String resolution= scan.next();
        if(resolution.equalsIgnoreCase("Fullhd")) {
            price += 100;
        }if(resolution.equalsIgnoreCase("4K")){
            price += 200;

        }

        System.out.println("Laptop price is: "+ price);



    }




}
