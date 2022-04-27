
class Student {
	
	int StudentID;
	String StudentName;
	 
	
	public int getStudentID() {
		return StudentID;
	}


	public void setStudentID(int studentID) {
		StudentID = studentID;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	static void main(String[] args) {
	   Student st = new Student();
	   st.StudentID = 1;
	   st.StudentName = "Joe";
	   println(st.getStudentID())
	   println(st.getStudentName())
	}
}
