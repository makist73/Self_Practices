package Interview_Practices.Real_Interviews;

import java.util.Arrays;
import java.util.List;

public class Chewy {

    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        String result = "";

        if (arr.contains(k)) {
            result = "yes";
        } else {
            result = "no";
        }

            System.out.println(result);

         return result;
}
    public static void main(String[] args) {

       findNumber(Arrays.asList(1,2,4,5,7,8),9);


        System.out.println("------------------");


        }




    }
