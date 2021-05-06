package Interview_Practices.Cybertek.Strings;

public class String_Reverse {
    //Write a return method that can reverse  String
    //
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverseMethod(String str){

            String word = str;
            String reverse="";

            for(int i= word.length()-1; i>=0; i-- ) {
               reverse += word.charAt(i);
                //reverse+=word.substring(i, i+1);
            }
           return reverse;
        }

    public static void main(String[] args) {

        System.out.println(reverseMethod("mom"));

    }

    }




