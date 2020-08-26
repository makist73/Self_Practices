package day39_CustomClass;

import javax.xml.bind.SchemaOutputResolver;

public class Car {
    /*
        Attributes: brand,model,year,color,mileage,price
     */
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
        //sets the information of the car objects
    }

        // 2012 Toyota Corolla, Red,10000, $4500
        public void getInfo () {
            System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", $"+price);
        }
        // prints the car info

    /*
    car1:Toyota
    car2:BMW
    car3:Tesla
     */

    }
