package Day23_Methods;

public class RemoveDuplicates {
    public static void main(String[] args) {
     /*   String str = "abcabcabcDDDEEEGGG";

        String result = ""; yeni bir string yapiyoruz.bu bizim
        sonucta alacagimiz string ve tirnak icini bos birakiyoruz.

        for(int i=0; i<str.length(); i++){
            if(!result.contains(str.substring(i,i+1))){
                          beginning index, ending index
                result +=str.substring(i,i+1);
            }
        }
        System.out.println(result);
        */

        RemoveDuplicates("javajavajava");

    }

        public static void RemoveDuplicates (String a){

            String result = ""; // yeni bir string yapiyoruz.bu bizim
            // sonucta alacagimiz string ve tirnak icini bos birakiyoruz.

            for (int i = 0; i < a.length(); i++) {
                if (!result.contains(a.substring(i, i + 1))) {
                    // beginning index, ending index
                    result += a.substring(i, i + 1);
                }
            }

            System.out.println(result);
        }


    }


