package Day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {


        String [] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
                   // index  0      1    2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts = 1; // int attempts= 0; dan baslarsak 4 defa calismis olur.
        while(num>12 || num<= 0){ // if ten while daha uygun oldugu icin degistirdik.
            // cunku gene gene sorucak.. loop kullanmamiz lazim
            System.out.println("Invalid Entry");// System.exit(0);
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;
            if (attempts == 3 && (num>12 || num<=0 ) ){
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0); // when you use the break statement here then still executed. o yuzden exit vermemiz lazim.
            }
        }

        String result =months[num-1]; // buradaki numara 12 verirsek geri 11.index numarasina donucek
       /* String result = "";
       if(num==1) {
          result=  months[num-1]; // ikiside string oldugu icin resultu assign edebiliyor buraya.



        }*/

        System.out.println(result);
    }
}
// su anda(sadece num>12 exit ) yaparsak  bug var cunku 0 yazildiginda - sayi cikiyor ve index number sorun verir.