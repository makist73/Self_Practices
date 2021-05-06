package Interview_Practices.Cybertek.Strings;

public class Palindrome {

    //Write a method that can check the word it is palindrome or not
    //
    //Ex: word="kayak" ==> kayak

    public static void palindrome(String str) {

        String input = str;
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        if (input.equalsIgnoreCase(output)) {
            System.out.println("palindrome");
        } else {
            System.out.println("NOT palindrome");
        }
       //return true;
        System.out.println(input);
        System.out.println(output);


    }
    public static void main(String[] args) {

        palindrome("Kayak");


    }
}
