public class calc1 {

  public static void add(double num1, double num2) {
    double result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }

  public static void subtract(double num1, double num2) {
    double result = num1 - num2;
    System.out.println(num1 + " - " + num2 + " = " + result);
  }

  public static void multiply(double num1, double num2) {
    double result = num1 * num2;
    System.out.println(num1 + " * " + num2 + " = " + result);
  }

  public static void divide(double num1, double num2) {
    if(num2!=0 || num2!=0.0)
    {double result = num1 / num2;
     System.out.println(num1 + " / " + num2 + " = " + result);
       }
    else
    {System.out.println("Undefined");}
    
  }

  public static void main(String[] args) {
    double numOne = Double.parseDouble(args[0]);
    double numTwo = Double.parseDouble(args[2]);
     char c=args[1].charAt(0);
     switch(c){

     case '+' : add(numOne, numTwo);
                break;
     case '-' : subtract(numOne, numTwo);
                break;
     case '*' : multiply(numOne, numTwo);
                break;
     case '/' : divide(numOne, numTwo);
                break;
     default:  System.out.println("Try Again");
  }
}
}