package Practice_04_15;

public class NestedLoops {
    public static void main(String[] args) {
        //                0   1     0   1   2     0   1   2
       char[][] arr2D= {{'A','B'},{'C','D','E'},{'F','J','H'}};
       //                   0            1            2
        //arr2D[0]
        for(int j=0; j<arr2D.length;j++) { // j: indez nums of 1D array
            for (int i = 0; i < arr2D[j].length; i++) { // i: index num of elements in 1D
                System.out.println(arr2D[j][i]);
            }
        }   //                   burdaki 1 i j ile ve asagidaki 1 i de j ile degistirdik.
       // for (int i=0 ; i< arr2D[1].length; i++) { bunu yazdigimizda 1 index numarali parantezimizin icinde
        // ki elementleri yazicak.
      //       System.out.println(arr2D[1][i]);}

        System.out.println("========================================");
       //  arr2D= {{'A','B'},{'C','D','E'},{'F','J','H'}};
      //                0            1            2

for ( char [] each1DArray : arr2D){
    for (char eachElement : each1DArray){
        System.out.println(eachElement);
    }

}



        }
}
