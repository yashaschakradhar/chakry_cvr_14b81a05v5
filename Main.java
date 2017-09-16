public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		StudentGroup sg=new StudentGroup(1);
		Student[] s=new Student[1];
		
     s[0]=new Student(11,"chak","1997-03-24",90.2);
     sg.setStudent(s);
     System.out.println(sg.getStudent(0).fullName);
		
		
		
		
		
		
		
	}

}
