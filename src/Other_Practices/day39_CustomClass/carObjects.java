package Other_Practices.day39_CustomClass;

public class carObjects {
    public static void main(String[] args) {

        Car car1=new Car();
    /*      car1.brand="Toyota";
            car1.model="Corolla";
            car1.year=2020;
            car1.color="White";
            car1.mileage=20000;
            car1.price=19000.50;
        */
        car1.setInfo("Toyota","Corolla",2020,"White",20000,19000.50);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("=============================");

        Car car2=new Car();
    /*      car2.brand="BMW";
            car2.model="X6";
            car2.year=2019;
            car2.color="Black";
    */

           car2.setInfo("BMW","X6",2019,"BLack",15000,40000);

            System.out.println(car2.brand);
            System.out.println(car2.model);
            System.out.println(car2.year);
            System.out.println(car2.color);

        System.out.println("=================================");

        Car car3 =new Car();
            car3.setInfo("Audi","A7",2017,"White",32000,35000);

        Car car4= new Car();
            car4.setInfo("Jeep","Wrangler",1980,"Blue",100000,7000);

            car3.getInfo(); // as print statement
            car4.getInfo(); // as print statement

            // 2012 Toyota Corolla, Red,10000, $4500
    }
}
