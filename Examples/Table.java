import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number whose table to print");
		int num=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+" is "+(num*i));
		}
	}
}