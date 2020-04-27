package calisma;

public class ArraylerdeUnique {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4, 4, 5};
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) { // arr[i] each index of array demek
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[j]);
            }


        }
        System.out.println("--------------------------------------------------");

        int[] arr1 = {1, 2, 2, 3, 4, 4, 5, 5, 5}; // arr[j]

        for (int j = 0; j < arr1.length; j++) {
            int count = 0; // 0 dan baslatiyoruz zamanla yukseliyor. bu numaranin arrayde kac defa ciktigini gosteriyor.
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr1[j]) { // compares each index of the array with the given value
                    count++; // everytime if the value is occured in the array,count will be increased by one.
                    // her seferinde bu if saglanirsa bir artirilarak devam ediyor.
                }

            }
            if (count != 1) {
                System.out.println(arr1[j]);
            }
        }

    }
}
