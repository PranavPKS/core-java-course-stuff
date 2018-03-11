import java.util.*;

public class calc1{
public static void add(double x, double y){
double result = x+y;
System.out.print(result);
}

public static void subtract(double x, double y){
double result = x-y;
System.out.print(result);
}

public static void multiply(double x, double y){
double result = x*y;
System.out.print(Double.valueOf(result)); 
}

public static void divide(double x, double y){
double result = x/y;
System.out.print(result);
}

public static void main(String[] args){

double numOne = Double.parseDouble(args[0]);
double numTwo = Double.parseDouble(args[2]);

char c = args[1].charAt(0);

if(c=='+')
	add(numOne, numTwo);
if(c=='-')
    subtract(numOne, numTwo);
if(c=='*') 
	multiply(numOne, numTwo); //Use * as "*" with the quotes in the command prompt for multiplication to work  
if(c=='/')
	divide(numOne, numTwo);

}

}

