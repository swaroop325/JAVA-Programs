import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI1
{ 
	public static void main (String[] args) throws java.lang.Exception
	{
char x,w,z;
        do {
            try {
double a,b;
		
Scanner s=new Scanner(System.in);
System.out.println("Enter the SOURCE:");
a=s.nextDouble();
/*
w=s.next().charAt(0);	




if(w >= 'a' && w <= 'z'){
System.out.println("Enter the SOURCE again:"); 


}
else{
a=w;
}
*/



System.out.println("\n Enter the DESTINATION:");

b=s.nextDouble();
/* 
z=s.next().charAt(0);
if(z >= 'a' && z <= 'z'){
System.out.println("Enter the DESTINATION again:");
	b=s.nextDouble();

}
else{
b=s.nextDouble();}
*/

double c=b-a;


double cost=c*10;

System.out.println("The total cost="+cost);

	} catch (Exception e) {
               System.out.println("Wrong input. Try again.");

            }
       
     
System.out.println("enter y to Continue(y/n)");
       Scanner s=new Scanner(System.in);
       x = s.next().charAt(0);

} while(x=='Y'|| x=='y');
    } 
}