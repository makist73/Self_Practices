package Other_Practices.String;

/*
2. write a program to ask userto enter first name and last name
    then print the full name in all upper case
 */

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next(); // cybertek

        System.out.println("Enter your last name: ");
        String lastName = input.next();  // school

        String fullName = firstName+" "+lastName; // cybertek school

        fullName = fullName.toUpperCase();  // CYBERTEK SCHOOL

        System.out.println(fullName);


    }

}
