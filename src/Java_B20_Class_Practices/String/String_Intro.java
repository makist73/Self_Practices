package Java_B20_Class_Practices.String;


public class String_Intro {
    public static void main(String[] args) {
        String str ="Cybertek";
        //Scanner input = new Scanner(System.in);


        String name = "Cybertek"; // Other_Practices.String literal
       String name2 = new String("Cybertek");

       String s1 = "Cat"; // Other_Practices.String literal   in Other_Practices.String pool
        String s2 = "Cat"; // Other_Practices.String literal   in Other_Practices.String pool
        System.out.println(s1 == s2);
                    //"Cat" == "Cat" true
        String d1 = "Dog"; // Other_Practices.String literal  in Other_Practices.String pool
        String d2 = "dog"; // Other_Practices.String literal  in Other_Practices.String pool
        System.out.println( d1 == d2);

        String t1 = new String ("Tiger");
        String t2 = new String ("Tiger");
        System.out.println(t1==t2);
        //              new Other_Practices.String("Tiger") == new Other_Practices.String ("Tiger") ==> false

        System.out.println("=========================");

        String c1 = "Cybertek"; // in Other_Practices.String pool
        String c2 =new String("Cybertek");  // in heap
        String c3 = new String ("Cybertek"); // in heap also(creats another one)
        String c4 = "Cybertek";  // Other_Practices.String pool (but use the same one, not creats another one)
        String c5 = "cybertek"; // Other_Practices.String pool ( not same with "Cybertek")
        System.out.println(c1==c2); // false
        System.out.println(c2 == c3); // false

        System.out.println(c1 == c4);  // true
        System.out.println(c4== c5);  // false

        System.out.println("======================");

        String str1 = "Java";
        str1 = "JavaScript";

        System.out.println(str1);
        str1 = "Java";
        System.out.println(str1);


    }
}
