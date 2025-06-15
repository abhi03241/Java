public class Student {
	public int rollNo;
	public String studentName;

	public void findGrade(int marks) {
		char grade;
		if (marks > 90)
			grade = 'A';
		else if (marks < 90 && marks > 80)
			grade = 'B';
		else if (marks < 80 && marks > 70)
			grade = 'C';
		else
			grade = 'D';
		System.out.println(grade);
	}
}