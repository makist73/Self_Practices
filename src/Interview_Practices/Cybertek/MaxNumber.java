package Interview_Practices.Cybertek;
import java.util.Scanner;
public class MaxNumber {
    // 1. write a program that asks user to enter 5 numbers and returns the maximum number

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int max=-11111111;

        for (int i=0; i<5; i++){
        System.out.println("enter a number");
        int num=scan.nextInt();
            if(num>max){
                max=num;
            }
        }
        System.out.println("max number: "+max);
    }
}
