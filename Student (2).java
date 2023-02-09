package Class;

public class Student {
	Student(){
		System.out.println("This is a Student Class:");
	}
	
		int age;
		String name;
		// Parameterized cons where we have to pass the parameter / arguments
		Student (int a,String n){
			age =a;
			name =n;	
		}
		void show() {
			System.out.println(age+" "+name);
		}
		public static void main(String[] args) {
			Student student=new Student();
		Parameterizedcons d=new Parameterizedcons(50,"Karan");
		Parameterizedcons d1=new Parameterizedcons(25,"Rohit");
		Parameterizedcons d2=new Parameterizedcons(21,"Roma");
		d.show();
		d1.show();
		d2.show();
		}
}
