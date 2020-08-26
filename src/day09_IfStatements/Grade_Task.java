package day09_IfStatements;

import java.util.Scanner;

public class Grade_Task {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your score");
        int average= scan.nextInt();

        if (average<=100 && average>=90 ){
            System.out.println("Grade: A");

        }else if (average<=89 && average>=80){
            System.out.println("Grade: B");

        }else if(average<=79 && average>=70){
            System.out.println("Grade: C");
        }else if (average<=69 &&average>=60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }

}
