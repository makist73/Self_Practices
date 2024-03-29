package Java_B20_Class_Practices.String;

public class substring_method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789...

        // substring(beg index, end index)
        String word1 = sentence.substring(0 , 4); // (0 , 3+1)

        System.out.println(word1);

        String word2 = sentence.substring(8 , 10+1);
        System.out.println(word2);


        System.out.println("===================");

        String sentence2 = "I like Movies and TV Series";
                    //      0123456789......
        String word3 = sentence2.substring( 7 , 13);


        System.out.println("====================");
        String firstName = "mUHTaR";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length()); //firstName.length() lastIndex +1

        firstName = firstCharacter.toUpperCase()+rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);

        System.out.println(firstName);

        System.out.println("==================");
        String lastName = "school";
        String firstChar = lastName.substring(0,1);  //s
        String remaining = lastName.substring(1); // chool

        lastName = firstChar.toUpperCase() + remaining.toLowerCase(); // "School"

        System.out.println(lastName);

        System.out.println("======================");


        String s = "I like Game Of Thrones";
        //          01234567.....
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming Language";
        //           01234567

        String language = s2.substring(7);
        System.out.println(language);
    }
}
