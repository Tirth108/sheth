public class operator{
public static void main (String [] args){
/* Operator
	1 . Arithmatic operator
	2 . Assignment operator
	3 . Comparison oprator
	4 . Logical operator
*/


//    1 . Arithmetic operator  :-  + , - , * , / ,%       

System.out.println("This is a Arithmetic operator .");
int num1 = 20 , num2 = 30 ;
System.out.println("Sum of num1 + num2  :---  " + (num1+num2) );
System.out.println("Division of num1 / num2    :--- " + (num1/num2) );
System.out.println("Multiplication of num1 * num2   :---  " + (num1*num2) );
System.out.println("Subtartion of num1 - num2  :---  " + (num1-num2) );
System.out.println("Modulo of num1 % num2  :---  " + (num1%num2) );

int n = 20 ;
System.out.println("num++  :---   "  + (n++));
//	num++ meaning that first num print the value of num and after that it's increse the value of num by 1
System.out.println("++num   :---  " + (++n));
//	++num  meaning that first ++ increse num value by 1 and the it's print the new value of num
System.out.println("num--   :---  "  + (n--));
//	num--   meaning that first num value is print and after that it's descrese the value of num by 1
System.out.println("--num   :--- " + (--n));
//	--num  meaning that first num value is decrese the by 1 and after that it's print the value of num



//       2 . Assignment operator    :-   +=  ,  -=  ,  *=  ,  /=  , %=

int no =  30 ;
System.out.println(" ");
System.out.println(" ");
System.out.println("This is a assignment operator");
System.out.println("+=   :---  " + (no+=2));
//	no+=2 in this no value is increse by 2 
System.out.println("-=    :---  "  +  (no-=4));
//	no-=2 in this no value is decrese by 4
System.out.println("*=    :---  "   + (no*=5));
//	no*=5 in this no value is mutiply by 5
System.out.println("/=    :--   "    + (no/=6));
//	no/=6 in this no value is devide by 6
System.out.println("%=   :---   "   + (no%= 8));
//	no%=8 in this no value is modulo by 8


//        3 . Comparison operator     :--    ==  ,  <=  ,  >=  ,  <   ,  >  ,  != 


//       4 . Logical operator      :--    && , ||  , !

}
}