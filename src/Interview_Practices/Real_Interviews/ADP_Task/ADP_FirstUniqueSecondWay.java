package Interview_Practices.Real_Interviews.ADP_Task;

public class ADP_FirstUniqueSecondWay {
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

            firstUnique("color");

        }
        public static String firstUnique(String str){
            str=str;
            String uniques="";    //clr

            for (int j=0; j<str.length(); j++){
                char ch=str.charAt(j);
                int count=0;
                for(int i=0; i<str.length(); i++){
                    if (ch==str.charAt(i)){
                        count+=1;
                    }
                }
                if (count==1){
                    uniques+=ch;
                }
            }
            if (!uniques.isEmpty()){
                System.out.println(uniques.charAt(0));
            }else{
                System.out.println("\"\"");
            }
    return uniques;
        }
}
