package Other_Practices.day16_String_Continue;
import java.lang.ref.SoftReference;
import java.util.Scanner;
public class StartEndWords {

    /*
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"

        NOTE: you will need nested If
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first word with 5 characters");
        String word1=scan.next();
        System.out.println("Enter second word with 5 characters");
        String word2= scan.next();

        if(word1.length()!=5 || word2.length()!=5){
            System.out.println("need to be exactly 5 chars length");
        }else if (word1.charAt(word1.length()-1)== word2.charAt(0)){
            System.out.println("Fizz");
        }else{
            System.out.println("Buzz");
        }

        String word3="";

        System.out.println(word3.isEmpty());
        System.out.println(word3.length());
}
    }