package StremOperatio;

public class Student {
	public int rollNo;
	public String name ;
	public float cgpa;
	
	public Student(String name , int rollNo, float cgpa) {
		this.cgpa=cgpa;
		this.name=name;
		this.rollNo=rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	
//
//	public int getRollNo() {
//		return rollNo;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public float getCgpa() {
//		return cgpa;
//	}

	
	
	
}
