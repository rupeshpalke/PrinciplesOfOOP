package principleOfOOP;

public class Student {
	private String institute = "SCSCOE";
	private String name;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	public Student(String name, String course, double fees, String branch, double cgpa, String degree, double sscPer,
			double hscPer, long phno) 
	{
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.branch = branch;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phno = phno;
		System.out.println("Student Registered :"+name);
	}
	public String getInstitute() {
		return institute;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public double getFees() {
		return fees;
	}
	public String getBranch() {
		return branch;
	}
	public double getCgpa() {
		return cgpa;
	}
	public String getDegree() {
		return degree;
	}
	public double getSscPer() {
		return sscPer;
	}
	public double getHscPer() {
		return hscPer;
	}
	public long getPhno() {
		return phno;
	}
	public void changeBranch(boolean permission, String branch) {
		if (permission) {
			this.branch = branch;
			System.out.println("Branch updated to :"+branch);
			
		} else {
			System.out.println("Please take permission");
		}
		
	}
	public void changePhno(boolean id, long phno) {
		if (id) {
			this.phno = phno;
			System.out.println("Phone updated to :"+phno);
		} else {
			System.out.println("Please provide valid id.");
		}
	}
	
	
	
}
