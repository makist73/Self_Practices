package Java_B20_Class_Practices.day12_Switch_Scanner;


import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
            double num = scan.nextDouble();

            String result =(num%2 == 0) ? num+ " is Even": num+" is Odd";
        System.out.println(result);
    }
}
