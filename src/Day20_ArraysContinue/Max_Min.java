package Day20_ArraysContinue;

public class Max_Min {
    public static void main(String[] args) {
        int [] arr = {10,6,3,1,200,100};
        int lastindex = arr.length-1;
        int max = arr[0];
        int min = arr[0];

        for (int i= 0; i <= lastindex; i++){ // array's index are compared with each other, and whichever is greater will be assigned to the max
            if (arr[i]>= max ){
                max= arr[i];
            }
            if(arr [i]< min) { // array's index are compared with each other, and whichever is smaller will be assigned to the min
                min= arr[i];
            }

        }

        System.out.println(max);
        System.out.println(min);





    }
}

