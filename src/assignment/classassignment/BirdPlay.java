package assignment.classassignment;

public class BirdPlay {
 
	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("꽥꽥이");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("짹짹");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
		
		
	}


}

abstract class Bird{
	protected String name;
	protected int legs;
	protected int length;

	abstract String fly();
	abstract String sing();
	abstract void setName(String name);

}
class Duck extends Bird{

	@Override
	public String fly() {
		return "날지 않습니다.";
	}

	@Override
	public String sing() {
		return "소리내어 웁니다.";
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "오리" + "(" + name + ")" + "는 " + fly() + "\n" +
				"오리" + "(" + name + ")" + "가 " + sing() + "\n" +
				"오리의 이름은 " + name + " 입니다."
				;
	}
}

class Sparrow extends Bird{

	@Override
	String fly() {
		return "날아다닙니다.";

	}

	@Override
	String sing() {
		return "소리내어 웁니다.";
	}

	@Override
	void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "참새" + "(" + name + ")" + "가 " + fly() + "\n" +
				"참새" + "(" + name + ")" + "가 " + sing() + "\n" +
				"참새의 이름은 " + name + " 입니다."
				;
	}
}
