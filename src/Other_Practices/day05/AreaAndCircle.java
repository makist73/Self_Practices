package Other_Practices.day05;
/*
1. Write a Java program that displays the area and perimeter of a circle that has a radius
of 5.5 using the following formulas:
perimeter = 2 * radius * 𝜋
area = radius * radius * 𝜋
 */
public class AreaAndCircle {
    public static void main(String[] args){
        double radius=5.5;
        double pi=3.14;
       double perimeter=2*radius*pi;
       double area =radius*radius*pi;
        System.out.println(perimeter);
        System.out.println(area);
    }

}
