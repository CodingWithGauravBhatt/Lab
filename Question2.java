package Lab16feb;

	class A {
	    public void printA() {
	        System.out.println("This is class A.");
	    }
	}

	class B extends A {
	    public void printB() {
	        System.out.println("This is class B.");
	    }
	}

	class C extends B {
	    public void printC() {
	        System.out.println("This is class C.");
	    }
	}

	public class Question2 {
	    public static void main(String[] args) {
	        C obj = new C();
	        obj.printA();  // Output: This is class A.
	        obj.printB();  // Output: This is class B.
	        obj.printC();  // Output: This is class C.
	    }
	}


