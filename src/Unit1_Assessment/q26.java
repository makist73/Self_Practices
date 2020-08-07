package Unit1_Assessment;

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        int one =scan.nextInt();
        int two=scan.nextInt();

        if(one-- > two *2){
            System.out.println("one");
        }else {
            System.out.println(two);
        }
    }
}
