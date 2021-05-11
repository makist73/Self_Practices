package Java_B20_Class_Practices.day18_Loop;
//1. Write a program that displays each even/odd number in popup between 1 and 32
public class Loop_Task2_OddEven {
    public static void main(String[] args) {

        for (int num=1; num<=32;num+=1){
           if(num%2==0){
               System.out.print(num+" ");
               System.out.println();
        }   if(num%2!=0){
                System.out.print(num+" ");
            }



        }
    }
}