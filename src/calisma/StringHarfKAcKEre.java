package calisma;

public class StringHarfKAcKEre {
    public static void main(String[] args) {
        String [] arr= {"A","B","C","A","B"};
    int count=0;
    for (int i=0; i<arr.length;i++){
        if(arr[i].equals("B")){
            count++;
        }
    }
        System.out.println(count);
}
}