/*A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers ,3 to car lighting and 4 for air purifiers. All other items have code 5 or more.While selling the goods, a sales tax of 2% to seat covers ,3% to steering wheelcovers, 4% to car lighting, 2.5% to air purifiers and 1.2% for all other items ischarged. A list containing the product code and price is given for making a bill.Write a java program using switch statements to prepare a bill.*/


import java.util.Scanner;	
class bill{
public static void main(String [] args){
int i,tq=0,tr=0,ttaxamo=0,ttax=0,ttotal=0;
System.out.println("1 . Seat cover");
System.out.println("2 . Sterring wheel cover");
System.out.println("3 . Car lighting");
System.out.println("4 . Air Purifier");
System.out.println("5 . More");
System.out.println("6 . Exit");
Scanner n = new Scanner(System.in); 
System.out.print("Ch.	");
System.out.print ("Qty.	");
System.out.print ("Rate.	");
System.out.print("Tax. Amo.	");
System.out.print("Tax.	");
System.out.print("Total	");
do
{
int taxamo,tax,total;
System.out.print(" ");
int num = n.nextInt();
i=num;
switch (num){
case 1 :
	System.out.print("        ");
	int q = n.nextInt();
	System.out.print("             ");
	int r = n.nextInt();
	taxamo=q*r;
	System.out.print("             "+taxamo);
	tax=(taxamo*2)/100;
	System.out.print("            "+tax);
	total=taxamo+tax;
	System.out.print("            "+total);
	tq=tq+q;
	tr=tr+r;
	ttaxamo=ttaxamo+taxamo;
	ttax=ttax+tax;
	ttotal=ttotal+total;
	
case 2 :
	break;
case 3 :
	break;
case 4 : 
	break;

}
}while (i!=6);	
}}

