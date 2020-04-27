package Day20_ArraysContinue;

public class WarmUp1 {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6, 7, 8,9};
        int lastindex = arr.length-1;
        int maximum=0;
        for (int i=0; i<= lastindex; i++ ) {

            if(arr [i] > maximum){   // array's index are compared with each other, and whichever is greater will be assigned to the max
                 maximum = arr [i];
            }



        }


        System.out.println("Maximum number is:" + maximum);

        int secondMax = 0;
        for (int j= 0; j< arr.length;j++) {
            if (arr[j]> secondMax && arr[j] !=maximum){
                      secondMax = arr[j];
            }
        }

        System.out.println("Second maximum number is:" + secondMax);
    }
}
