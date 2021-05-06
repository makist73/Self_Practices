package Interview_Practices.Cybertek;

public class String_Frequency_of_Characters {

    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

   // public static String frequencyOfChars(String str) {
   public static void main(String[] args) {

       String input = "AAABBCDD";  //A3B2C1D2
       String nonDuplicate = "";

       for (int i = 0; i < input.length(); i++) {
           for (int j = 0; j < input.length(); j++) {
               if (i != j) {
                   nonDuplicate += i;
               }
           }
       }
       System.out.println(nonDuplicate);
   }

}



