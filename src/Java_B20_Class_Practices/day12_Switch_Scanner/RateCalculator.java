package Java_B20_Class_Practices.day12_Switch_Scanner;

import java.util.Scanner;
/*
3. write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)

 */

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("Enter your salary: ");
        double salary =input.nextDouble();
        System.out.println("How many hours do you work in a week");
        int weeklyHour = input.nextInt();
        int totalHours = weeklyHour * 52;
        double hourlyRate = salary /totalHours;
        System.out.println(" Your hourly rate is: $"+hourlyRate);
    }
}
