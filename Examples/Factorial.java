import java.util.Scanner;
public class Factorial{
   public static void main(String[] args){
	   Scanner input= new Scanner(System.in);
	   System.out.println("Enter the number whose factorial to find");
	   int num=input.nextInt();
       int result = 1;
       for (int i = 1; i <= num; i++) {
           result = result * i;
       }
       System.out.println("The factorial of "+num +" is " + result);
   }
}