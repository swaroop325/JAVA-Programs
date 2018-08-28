import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main(String[] args) {
        char x;
        do {
            try {
char w,z;
		double a,b;
int ch;
Scanner s=new Scanner(System.in);


System.out.println("*********CALCULATOR***********");
System.out.println("Enter the number 1:");
w=s.next().charAt(0);	


j1:

if(w >= 'a' && w <= 'z'){
System.out.println("Enter the number 1 again:");
a=s.nextDouble();
continue j1;
}
else{
a=w;
}




System.out.println("\n Enter the number 2:");
z=s.next().charAt(0);
if(z >= 'a' && z <= 'z'){
System.out.println("Enter the number 2 again:");
	b=s.nextDouble();

}
else{
b=s.nextDouble();}

System.out.println("Arithemetic Operations \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.Modulus\n 6.exit  \n Enter your choice:");
	
ch=s.nextInt();



switch(ch)
{
case 1:

System.out.println("Result:"+(a+b));
break;


case 2:

System.out.println("Result:"+(a-b));
break;


case 3:

System.out.println("Result:"+(a*b));
break;


case 4:

if(b==0)
{
System.out.println("Second number cant be zero");
}
else
{
System.out.println("Result:"+(a/b));
}
break;


case 5:

System.out.println("Result:"+(a%b));
break;

case 6:
System.exit(0);
break;


default:
System.out.println("Invalid choice!!");
 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

 }  } catch (Exception e) {
               System.out.println("Wrong input. Try again.");

            }
       
     
System.out.println("enter y to Continue(y/n)");
       Scanner s=new Scanner(System.in);
       x = s.next().charAt(0);

} while(x=='Y'|| x=='y');
    } 
}