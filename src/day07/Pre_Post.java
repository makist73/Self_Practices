package day07;

public class Pre_Post {
    public static void main(String[] args) {

        int x=2;
        int y= x++; // y=2 x=3
        System.out.println(y);
        System.out.println(x);

        int x1=2;
        System.out.println(++x1);

        int a =1;
        a=-a-- + a++ /-a-- * --a;
     //    -1  + 0   / -1  * 0
        //  -1  -  0       * 0
        //     -1 - 0
        //       -1

        System.out.println(a);
    }
}
