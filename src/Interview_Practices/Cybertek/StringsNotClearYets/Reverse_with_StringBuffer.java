package Interview_Practices.Cybertek.StringsNotClearYets;

public class Reverse_with_StringBuffer {
    //Write a return method that can reverse  String
    // use StringBuffer or StringBuilder
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverse(String str) {
       /*
         StringBuffer word =new StringBuffer(str);
         String reverse=word.reverse().toString();
         return reverse;
        */

        return new StringBuilder(str).reverse().toString();


    }
    public static void main(String[] args) {
      System.out.println(reverse("Kayak"));


    }

}
