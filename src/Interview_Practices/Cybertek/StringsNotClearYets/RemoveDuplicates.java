package Interview_Practices.Cybertek.StringsNotClearYets;

public class RemoveDuplicates {
/*
    3. write a program that can remove the duplicates from any given String
    Ex:
    input: abcabcaabb
    output: abc
 */
    public static void main(String[] args) {

        String word ="abcabcaabb";
        String result="";

        for (int i=0; i<word.length(); i++){
            String s=""+ word.charAt(i);
            if (result.contains(s)){
                continue;
            }

           result+=s;

        }
        System.out.println(result);

}

}

