package Day29_Wrapper_ArrayList;

public class Practice {
    public static void main(String[] args) {
        String[] arr = {"1", "2.5", "3", "3.5", "4.5"};
        double max = Double.MIN_VALUE; //2.5 1
        for (String each : arr) { // 5, each: 1,2.5,3,3.5,4.5
            double num = Double.valueOf(each);
            //double v1 = 1;
            // double v2 =2.5;
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
        System.out.println("=======================");
        String [] arr2 = {"100","1","2.5","3","3.5","4.5","-55"};
        double [] numbers = new double [arr2.length];   //[0.0,0.0,0.0,0.0,0.0]

    }
}