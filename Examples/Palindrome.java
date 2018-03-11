import java.util.*;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Please enter a string: ");
        String str = scanner.next();

        Palindrome palin = new Palindrome();
        int revNum = palin.reverse(num);
        String revStr = palin.reverse(str);

        if (num == revNum) {
            System.out.printf("\n The number %d is a Palindrome ", num);
        } else {
            System.out.printf("\n The number %d is not a Palindrome ", num);
        }
        if (str.equalsIgnoreCase(revStr)) {
            System.out.printf("\n The string '%s' is a Palindrome ", str);
        } else {
            System.out.printf("\n The string '%s' is not a Palindrome ", str);
        }
    }
    
    // Method to return the reverse of a number
    public int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
    }
    
    // Method to return the reverse of a string
    public String reverse(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }
}