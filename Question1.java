package Today23Feb;

class Bank {
	double interstRate () {
		return 0;
	}
}
class sbi extends Bank{
	double interstRate () {
		return 0.08;
	}
}
class icici extends Bank{
	double interstRate () {
		return 0.07;
	}
}
class axis extends Bank{
	double interstRate () {
		return 0.09;
	}
}
public class Question1 {
public static void main(String[] args) {
	Bank bank;
	bank = new sbi();
	System.out.println("SBI Rate of Interst ="+" "+bank.interstRate());
	bank = new icici();
	System.out.println("ICICI Rate of Interst ="+" "+bank.interstRate());
	bank = new axis();
	System.out.println("AXIS Rate of Interst ="+" "+bank.interstRate());
}
}

