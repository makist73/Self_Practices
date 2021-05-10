package Interview_Practices.Cybertek.Strings;

public class OccurrencesOfChar {
    /*
 2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
 */
    public static void main(String[] args) {
        String str="cybertek school";
        char ch=str.charAt(0);
        String output="";
        int count=0;

        for (int i=0; i<str.length(); i++){

           char each=str.charAt(i); // a,a,a,b
            if (each==ch){
                count++;

            }


        }

        System.out.print(count);
    }
}
