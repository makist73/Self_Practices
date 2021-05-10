package Interview_Practices.Cybertek;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int min = 99999999;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num =scan.nextInt();
            if (num < min) {
                min = num;
            }

        }

        System.out.println("min number: "+min);

    }





}