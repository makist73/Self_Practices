package Java_B20_Class_Practices.day24_Arrays;
import java.lang.String;
public class Unique {
    /*
 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */
    public static void main(String[] args) {

        String input="aabccd";
        String unique="";    //b

        for (int i=0; i<input.length(); i++) {
            char ch=input.charAt(i);      //  a,a,b,c,c,d
            int first=input.indexOf(ch);   // 0 0 2 3 3 5
            int last=input.lastIndexOf(ch);// 1 1 2 4 4 5
            if(first==last){
                unique+=ch;
            }
        }
        System.out.println(unique);

    }

}
