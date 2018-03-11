import java.util.Scanner;
class Sum_Of_Prime { 
	public static void main(String args[]){ 
	int number = 2; 
	int count = 0; 
	long sum = 0; 
	System.out.println("Enter the limit till you want to see the sum of prime numbers");
	Scanner input=new Scanner(System.in);
	int num= input.nextInt();
	while(count < num){
		if(isPrimeNumber(number)){ 
		sum += number; count++;
		} 
		number++; 
	} 
	System.out.println(sum);
	}
	private static boolean isPrimeNumber(int number){
	for(int i=2; i<=number/2; i++){ 
	if(number % i == 0){ 
		return false;
	} 
	}
		return true;
	} 
}
