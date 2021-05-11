package Interview_Practices.Cybertek.StringsNotClearYets;

public class FindUniques_issue {

    public static void main(String[] args) {
// first way
        String word = "AABBBD";
        String uniques = "";

        for (int i = 0; i < word.length(); i++) {
            String s = "" + word.charAt(i);
            if (!uniques.contains(s)) {
                uniques += s;
            }

        }
        System.out.println(uniques);


        System.out.println("=============================");
// Second way
        for (int i = 0; i < word.length(); i++) {
            String s = "" + word.charAt(i);

            if (uniques.contains(s)) {
                continue;
            }
            uniques += s;
        }

        System.out.println(uniques);


    }
}