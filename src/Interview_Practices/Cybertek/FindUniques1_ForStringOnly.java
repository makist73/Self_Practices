package Interview_Practices.Cybertek;

public class FindUniques1_ForStringOnly {
//1. write a program that can find the unique characters from a String
//        Ex:
//            input: aabcc
//            output: b

    public static void main(String[] args) {

    // 1st way: this methods applies only for strings
        String input = "aabcc";
        String uniques = "";  //b

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);      //  a,a,b,c,c
            int first = input.indexOf(ch);   // 0 0 2 3 3
            int last = input.lastIndexOf(ch);// 1 1 2 4 4
            if (first == last) {
                uniques += ch;
            }
        }
        System.out.println(uniques);
    }
}