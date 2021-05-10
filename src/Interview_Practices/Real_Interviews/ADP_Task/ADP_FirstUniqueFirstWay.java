package Interview_Practices.Real_Interviews.ADP_Task;

public class ADP_FirstUniqueFirstWay {
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

        firstUnique("session");

    }
    public static String firstUnique(String str){

        String word = str;        //“color”
        String uniques = "";      // “c”

        for (int i = 0; i <= word.length() - 1; i++) {
            char ch = word.charAt(i);
            int first = word.indexOf(ch);
            int last = word.lastIndexOf(ch);
            if (first == last) {
                uniques += ch;

            }
        }
        if (!(uniques.isEmpty())) {
            System.out.println(uniques.charAt(0));
        } else {
            System.out.println("\"\"");
        }

        return uniques;
    }
}