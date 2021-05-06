package Interview_Practices.Cybertek;

public class SumOfDigitsInString {
    //Write a method that can return the sum of the digits in a string



    public static int sumOfDigit(String word){
        //String word="Murata";  // 15
        int sumOfDigits=0;
        for (int i=0; i<= word.length(); i++){
            sumOfDigits+=i;

        }
        return sumOfDigits;
    }
    public static void main(String[] args){

        System.out.println( sumOfDigit("mur"));
    }
}
