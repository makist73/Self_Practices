package Other_Practices.day10_IfStatements;
  /*
  grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F

   */
public class GradeCalculator {

      public static void main(String[] args) {

          int score = 90;
          String grade ="";

          if(score >=90 && score<=100){
             grade = "You made A ";
          }else if (score >=80 && score <90){
              grade ="You made B ";
          }else if ( score >= 70 && score< 80){
              grade= "You made C ";
          }else if ( score >=60 && score <70){
              grade = "You made D ";

          }else if  ( score < 60 && score >=0){
              grade = " You made F";
          }else{
              grade ="Invalid Score";
          }
          System.out.println(grade);

      }
}
