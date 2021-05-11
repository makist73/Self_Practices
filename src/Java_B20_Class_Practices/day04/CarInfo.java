package Java_B20_Class_Practices.day04;
/*
            Year
            Brand
            Model
            Mileage
            Price
        Ex:
                2020
                BMW
                X5
                30000
                45000

            output:
                2020 BMW X5, 3000 miles, $45000
 */

public class CarInfo {
    public static void main(String[] args) {

        int Year= 2020;
        String Brand ="BMW";
        String Model ="X5";
        int  Mileage =30_000;
        double Price =45000;

        System.out.println(Year+" "+Brand+" "+Model+", "+Mileage+" miles, $"+Price);

    }
}
