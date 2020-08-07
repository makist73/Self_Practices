package day05;

import javax.sound.midi.Soundbank;

public class EmployeeInfo {

    public static void main ( String[] args){
        String firstName = "John";
        String lastName = " Alexander";
        String gender = "Male";
        int age =35;
        String companyName = " Capital Bank";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried= false;
        double salary= 120_000.50;

        System.out.println("Employee' full name is: "+ firstName+lastName);
     System.out.println(firstName+lastName+"' gender is: "+gender);
        System.out.println(firstName+lastName+"' age is: "+ age+ " years old");
        System.out.println(firstName+lastName+" works at:"+companyName);
        System.out.println(firstName+lastName+"' Job title is:"+jobTitle);
        System.out.println(firstName+lastName+ "' salary is:"+salary+" USD");
        System.out.println(firstName+lastName+" is full time employee: "+isFullTime);
        System.out.println(firstName+lastName+" is married: "+isMarried);

    }
}
