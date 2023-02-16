package Lab16feb;

	class Arithmetic {
	    public int add(int a, int b) {
	        return a + b;
	    }
	}

	class Adder extends Arithmetic {
	}

	public class Question1  {
	    public static void main(String[] args) {
	        // create an instance of Adder
	        Adder myAdder = new Adder();

	        // call the add method on the Adder object
	        int result = myAdder.add(5, 10);

	        // print the result
	        System.out.println(result);  // Output: 15
	    }
	}


