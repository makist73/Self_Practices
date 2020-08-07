package Unit1_Assessment;

import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);

     byte b1 = userInput.nextByte();
        byte b2 = userInput.nextByte();
        byte b3 = userInput.nextByte();

        int max =(b3>b2)? b3 +2 : (b2>b1) ? b2 - 4 : b1 * -1;
        System.out.println(max);
    }
}
