package Interview_Practices.Cybertek;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min=999999999;
        int max=-999999999;

        for(int i =0; i<5; i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(num>max){
                max=num;
            }

            if(num<min){
                min=num;
            }
        }

        System.out.println("max num:" +max);
        System.out.println("min num:" +min);
    }
}
