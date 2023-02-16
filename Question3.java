package Lab16feb;


	class Teacher {
	    String college;
	    String designation;

	    public void work() {
	        System.out.println("Teaching...");
	    }
	}

	class ITTeacher extends Teacher {
	    public void teachIT() {
	        System.out.println("Teaching IT...");
	    }
	}

	class MathTeacher extends Teacher {
	    public void teachMath() {
	        System.out.println("Teaching Math...");
	    }
	}

	class SoftSkillTeacher extends Teacher {
	    public void teachSoftSkill() {
	        System.out.println("Teaching Soft Skills...");
	    }
	}

	public class Question3 {
	    public static void main(String[] args) {
	        ITTeacher itTeacher = new ITTeacher();
	        itTeacher.college = "ABC College";
	        itTeacher.designation = "IT Teacher";
	        itTeacher.work();  // Output: Teaching...
	        itTeacher.teachIT();  // Output: Teaching IT...
	    }
	}

