/*Write a java program to scan 3 integer values from the command line argument and display the maximum number using conditional operator.*/
import java.util.Scanner;
class max{
public static void main(String[]args){
Scanner n= new Scanner(System.in);
System.out.println("Enter the three number");
int num1=n.nextInt();
int num2 = n.nextInt();
int num3 = n.nextInt();
if(num1 >= num2 && num1 >= num3)
{
	System.out.println(num1 + " is Max " );
}
else if(num2 >= num1 && num2 >= num3 )
{	
	System.out.println(num2 + " is Max" );
}
else
{
	System.out.println(num3 + " is Max");
}
}
}
