package Class;

import java.util.Scanner;

public class Question2 {
	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		//create a scanner object for input

		System.out.print("Enter the first number\n");
		int num1=sc.nextInt();//reads num1 from user
		
		System.out.print("Enter the second number\n");
		int num2=sc.nextInt();;//reads num2 from user
		
		System.out.print("Enter the Third number\n");
		int num3=sc.nextInt();;//reads num3 from user

		//calling the method
		findSmallest(num1,num2,num3);

		}

		static void findSmallest(int num1,int num2, int num3){//method definition
		    if(num1<num2 && num1<num3){
		        System.out.println(num1+" is the smallest number");
		        
		    }
		    else if(num2<num1 && num2<num3){
		        System.out.println(num2+" is the smallest number");
		        
		    }
		    else{
		        System.out.println(num3+" is the smallest number");
		        
		    }
		}
		}