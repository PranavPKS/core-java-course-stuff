import java.util.Scanner;
class calc2{                                                                           //Base Class declared
double a,b;
void enter(){
Scanner p=new Scanner(System.in);
System.out.println("Enter first number");
a=p.nextDouble();
System.out.println("Enter second number");
b=p.nextDouble();}
}
class add1 extends calc2{
void add()
{
double s;
s=a+b;
System.out.println("Sum is"+s);
}
}
class mul1 extends add1{                                                     // Derived class 1 declared
void mul(){
double k;
k=a*b;
System.out.println("Multiplication of 2 nos is:"+k);
}
}
class sub1 extends mul1{                                                       // Derived class 2 declared
void sub()
{
double d;
d=a-b;
System.out.println("Subtraction is"+d);
}
}

class div1 extends sub1 {                                                        // Derived class 3 declared
void div()
{
double e;
if(b!=0 || b!=0.0)
{
e=a/b;
System.out.println("Division is"+e);}
else
{System.out.println("Undefined");}

}
}
class calc22{
public static void main(String args[])
{
div1 d=new div1();
d.enter();
Scanner p=new Scanner(System.in);
System.out.println("Enter a choice + - * /");
char c=p.findInLine(".").charAt(0);
     switch(c){

     case '+' : d.add();
                break;
     case '-' : d.sub();
                break;
     case '*' : d.mul();
                break;
     case '/' : d.div();
                break;
     default:  System.out.println("Try Again");
  }



}
}