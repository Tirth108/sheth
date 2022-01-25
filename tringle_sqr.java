/*  Write a program to calculate the hypotenuse of right angled triangle when othersides of the triangle are given. (Hypotenuse = square root (x*x + Y *Y))      */  

import java.lang.Math;
import java.util.Scanner;
class tringle_sqr{
public static void main(String[]args){
double a,b,c,d;
Scanner n = new Scanner(System.in);
System.out.println("Enter the value of x ");
double x = n.nextDouble();
System.out.println("Enter the value of y "); 
double y = n.nextDouble();
a= Math.pow(x,2);
b= y*y;
c= a+b;
d=(Math.sqrt(c));
System.out.println("Hypotenuse =  " + d);
}
}
