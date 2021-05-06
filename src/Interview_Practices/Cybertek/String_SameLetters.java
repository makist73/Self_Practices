package Interview_Practices.Cybertek;

import java.util.Arrays;

public class String_SameLetters {
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true
    //same("abc",  "abb"); -> false

    public static boolean same(String str1, String str2){

        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a="";
        String b="";

        for (char each: ch1){
            a+=each;
      }
        for (char each: ch2){
            b+=each;
        }

        return a.equals(b);
    }

    public static void main(String[] args) {
        String str1="bbbaaaa";
        String str2="aaaabb";
        System.out.println(same(str1,str2));

    }

}
