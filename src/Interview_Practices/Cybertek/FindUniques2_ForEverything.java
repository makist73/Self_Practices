package Interview_Practices.Cybertek;

import java.util.Scanner;

public class FindUniques2_ForEverything {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input for finding the uniques");
        String str = scan.next();
        String expectedResult = "";
        for (int j = 0; j < str.length(); j++) {// this loop for finding frequency of every single characters
            char ch = str.charAt(j); // a,a,b,c,c
            int count = 0; // frequency of ch
            for (int i = 0; i < str.length(); i++) { // this for loop used for finding the frequency of ch and assign it to count
                char each = str.charAt(i);  //a,a,b,c,c
                if (ch == each) {
                    count += 1;
                }
            }

            if (count == 1) {   // if it only occurred on time
                expectedResult += ch;
            }
        }
        System.out.println(expectedResult);

    }
}
