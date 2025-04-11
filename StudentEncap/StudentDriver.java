package principleOfOOP;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Rupesh", "E&Tc", 120000.00, "Bhor", 7.10, "B.E", 73.00, 71, 9876543210l);
		System.out.println(s1.getName()); 
		System.out.println(s1.getInstitute());
		System.out.println(s1.getBranch());
		System.out.println(s1.getDegree());
		System.out.println(s1.getCourse());
		System.out.println(s1.getFees());
		System.out.println(s1.getCgpa());
		System.out.println(s1.getSscPer());
		System.out.println(s1.getHscPer());
		System.out.println(s1.getPhno());
		s1.changeBranch(true, "Pune");
		s1.changePhno(true, 9876543211l);
		System.out.println(s1.getBranch());
		System.out.println(s1.getPhno());
	}
	
}
