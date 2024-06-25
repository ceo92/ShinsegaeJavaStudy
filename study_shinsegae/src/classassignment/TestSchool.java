package classassignment;

public class TestSchool {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setId(200201);
		Teacher t = new Teacher ();
		t.setName("홍길동");
		t.setAge(30);
		t.setSubject("JAVA");
		Employee  e= new Employee();
		e.setName("홍길동");
		e.setAge(40);
		e.setDept("교무과");
		
		s.print();
		t.print();
		e.print();
	}

}

class Teacher{
	private String name;
	private int age;
	private String subject;
	public void print(){
		System.out.println("이름 : " + name + "\t\t나이 : " + age + "\t\t담당과목 : " + subject+"\t\t");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
class Employee{
	private String name;
	private int age;
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print(){
		System.out.println("이름 : " + getName() + "\t\t나이 : " + getAge() + "\t\t부서 : " + getDept()+"\t\t");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
class Student{
	private String name;
	private int age;
	private int id;
	public void print(){
		System.out.println("이름 : " + name + " \t\t나이 : " + age + "\t\t학번 : " + id+"\t\t");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
