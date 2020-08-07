package ForLoop;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/*
1. write a program that asks user's first and last name,
then prints out the initials of the user
                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
 */
public class Initials {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String firstname= scan.next();
        String lastname =scan.next();

       /*String initial= firstname.substring(0,1)+"."+lastname.substring(0,1);
        initial= initial.toUpperCase();
        System.out.println(initial);

        */

       /* char ch1= firstname.toUpperCase().charAt(0);
          char ch2= lastname.toUpperCase().charAt(0);
          System.out.println(ch1+"."+ch2);
        */
         char ch1 =firstname.charAt(0);
         char ch2 =lastname.charAt(0);
         String initial=""+ ch1+"."+ch2;
            initial=initial.toUpperCase();
        System.out.println(initial);

    }
}