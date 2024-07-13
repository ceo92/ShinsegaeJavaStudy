package assignment._0627assignment.inheritanceassignment;

public class Student {

	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public void calcReturnFee(){
		if (subject.equals("javaprogram")){
			returnFee = fee*0.25;
		}
		else if (subject.equals("jspprogram")){
			returnFee = fee*0.2;
		}
		else{
			System.out.println("그런 과정명은 없습니다.");
			System.exit(0);
		}
	}

	public void print(){
		System.out.println(name + " 씨의 과정명은 " + subject + " 이고 교육비는 " + fee + "원이며 환급금은 " + String.format("%.0f" , returnFee) + "원 입니다");
	}


	public static void main(String args[]){
			Student stu = new Student("차은우", "jsppdrogram",
			500000);
	 		stu.calcReturnFee();
			stu.print();
	}
}  