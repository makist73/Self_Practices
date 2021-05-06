package Other_Practices.day07;

/* write a program that can verify if a number is positive, negative, 0
        Positive_Negative_0
        Ex:
            number = 120
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 is zero? false*/


public class Positive_Negative_0 {

    public static void main(String[] args) {
         int number = 120;

         boolean result1 = number > 0;
         boolean result2 = number <=0;

        System.out.println(number + " is a positive number? "+result1);
        System.out.println(number + " is a negative number? "+result2);
        System.out.println(number + " is zero? "+result2);



    }
}
