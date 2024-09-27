
public class main {
	public static void main(String[] args) {
		Student student=new Student();
		Idnumber idnumber=new Idnumber();
			
		Student student1=new Student();
		Idnumber idnumber1=new Idnumber();
			
		Student student2=new Student();
		Idnumber idnumber2=new Idnumber();
			
		System.out.print("학생");
		System.out.print(student.getK()+ " - ");
		System.out.print("학번 : ");
		System.out.println(idnumber.getK());
			
		System.out.print("학생");
		System.out.print(student1.getK() + " - ");
		System.out.print("학번 : ");
		System.out.println(idnumber1.getK());
			
		System.out.print("학생");
		System.out.print(student2.getK() + " - ");
		System.out.print("학번 : ");
		System.out.println(idnumber2.getK());
	}
}

class Student {
	private static int i=0;
	private int k=0;
	
	int getK() {
		return k;
	}
	
	Student() {
		i++;
		k=i;
	}
}

class Idnumber {
	private static int j=20240000;
	private int k=0;
	
	int getK() {
		return k;
	}
	
	Idnumber() {
		j++;
		k=j;
	}
}