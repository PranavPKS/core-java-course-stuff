import java.util.Scanner;
class Fibonacci{
    public static void main(String a[]){
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter the number till you want to print the series");
		 int num=input.nextInt();
         int febCount = num;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i] + " ");
         }
    }
}