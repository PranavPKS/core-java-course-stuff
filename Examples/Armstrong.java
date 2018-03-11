import java.util.Scanner;
public class Armstrong {

	public boolean isArmstrongNumber(int number){
		
		int tmp = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;
		int div = 0; 
		while(tmp > 0) 
		{ 
			div = tmp % 10; 
			int temp = 1;
			for(int i=0;i<noOfDigits;i++){
				temp *= div;
			}
			sum += temp;
			tmp = tmp/10; 
		} 
		if(number == sum) {
			return true; 
		} else {
			return false; 
		} 
	}
	
	public static void main(String a[]){
		Armstrong obj = new Armstrong();
		System.out.println("Enter a number");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println(obj.isArmstrongNumber(num));
	}
}