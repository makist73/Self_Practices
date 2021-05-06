package Other_Practices.day19_forLoop;

public class OddEven {


    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0 ) { // pre: i MUST be odd number
                if(i % 5==0 && i % 3 ==0 ) { // sub: MUST be divisible by 3&5
                    System.out.print(i + " ");
                }

            }

        }
        System.out.println();
    }
}
