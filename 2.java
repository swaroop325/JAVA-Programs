import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number;
   Scanner sc=new Scanner(System.in);
   number=sc.nextInt();//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
