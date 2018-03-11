import java.util.Scanner;
class Sum_Of_Digits {
	int sum = 0;
	public int getNumberSum(int number){
		if(number == 0){ 
		return sum;
		} else {
			sum += (number%10);
			getNumberSum(number/10);
		}
		return sum;
		}
	public static void main(String args[]){
		Sum_Of_Digits obj = new Sum_Of_Digits();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		System.out.println("Sum is: "+obj.getNumberSum(num));
	}
}
