import java.util.Scanner;
class Reverse {
	public int reverseNumber(int number){
		int reverse = 0; 
		while(number != 0){
			reverse = (reverse*10)+(number%10);
			number = number/10; 
		}
		return reverse; 
	}
	public static void main(String a[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number whose reverse you would want?");
		int num= input.nextInt();
		Reverse obj = new Reverse();
		System.out.println("Reverse of "+num+" is "+obj.reverseNumber(num));
	}
}