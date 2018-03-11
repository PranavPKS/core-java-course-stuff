import java.util.Scanner;
class Pascal_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter number of lines to print");
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int rows = n;
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                 System.out.format("%4d",number);
                 number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
