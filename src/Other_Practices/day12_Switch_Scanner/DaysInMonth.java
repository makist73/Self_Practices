package Other_Practices.day12_Switch_Scanner;
/*
    HINT:
    28 days : 2
    30 days : 4,6,9,11
    31 days : 1,3,5,7,8,10,12
    invalid : month >12 || month <1
 */

public class DaysInMonth {
    public static void main(String[] args) {

        int month =10;
        String result ="";
        switch(month){

            case 4:
            case 6:
            case 9:
            case 11:
                result ="30 Days";
                break;
            case 2:
                result ="28 Days";
                break;


            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result ="31 Days";
                break;

            default:
               result ="Invalid";

                System.out.println(result);
        }
    }

}
