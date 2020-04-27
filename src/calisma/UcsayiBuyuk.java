package calisma;
// verilen 3 sayidan en buyugu hangisi bulalim...

public class UcsayiBuyuk {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 200;
        int max = sayi1;

        if (max<sayi2){
            max= sayi2;
        }
        if (max<sayi3){
            max= sayi3;
        }
        System.out.println("En buyuk " +max);





    }
}
