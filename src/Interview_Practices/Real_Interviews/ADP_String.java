package Interview_Practices.Real_Interviews;

public class ADP_String {
/*
    Write a function that takes a single string parameter and returns the first non repeated
    character in the string. If no such condition exists, return an empty string.
            Test Data:
        String Expected Result
        “watermelon”   “w”
        “aardvark”     “d”
        “color”        “c”
        “session”      “e”
        “abba”         “”
 */

    public static void main(String[] args) {
        unique("abba");
    }
public static String unique(String str){

        String input =str;
        String result = "";

        for(int i = 0; i <= str.length()-1; i++  ){

            //  String s =  ""+str.charAt(i);  //a,  b,  a,  b
            String s = str.substring(i, i+1);

            if( !result.contains(s) ){
                result += s;
            }


        }
    System.out.println(result);
    return result;

}
}

