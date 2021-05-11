package Java_B20_Class_Practices.day02_printStatements;

public class GasReceipt {
    public static void main (String [] ags){

        double gallons =10.87;
        double price =2.089;
        double total = gallons*price;

        System.out.println("MCLEAN STORE");
        System.out.println("2019-06-19   04:38PM" );
        System.out.println("Gallons: "+gallons);
        System.out.println("Price/gallon: $ "+price);
        System.out.println("Fuel total: $ "+total);
    }
}
