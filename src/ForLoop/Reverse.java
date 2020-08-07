package ForLoop;
/*
2. write a program that can reverse the following string:
        String str = "Java";
         output: avaJ
       please provide two solutions:
        first solution, you MUST use substring method
      second solution, you MUST use charAt method

    */

public class Reverse {
    public static void main(String[] args) {
        String str = "Java";
        String s1= str.substring(1);//ava
        String s2= str.substring(0,1); // J
        System.out.println(s1+s2);

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(2);
        char ch4 = str.charAt(3);
        String result=""+ch4+ch3+ch2+ch1;
        System.out.println(result);

    }
}
