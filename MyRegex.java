package Today15Mar;

import java.util.Scanner;

class MyRegex {
	public static void main(String[] args){ //main method
	    Scanner in = new Scanner(System.in); // take a scanner class for user input 
	    System.out.println("Enter ip address"); //print the line
	    while(in.hasNext()){  // take while lop
	        String IP = in.next();
	        System.out.println(IP.matches(new NewIP().pattern));
	    }}}
	class NewIP {//takee new class
		//make meta method
	public static String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
	public static String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 +"." +  zeroTo255;
	}