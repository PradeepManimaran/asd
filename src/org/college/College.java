package org.college;
public class College {
	private void collegeName() {
		System.out.println("College : Panimalar Eng College ");
}
	private void collegeCode() {
		System.out.println("College Code: 1123");
}
	private void collegeRank() {
		System.out.println("College Rank: 11");
}
	public static void main(String[] args) {
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s = new Student();
		s.studentN();
		s.studentDept();
		s.studentId();
		Hostel h = new Hostel();
		h.hosteln();
		Dept d = new Dept();
		d.deptName();
	}
}
