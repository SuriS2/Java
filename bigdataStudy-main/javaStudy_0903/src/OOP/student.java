package OOP;

public class student {
	private static String name;
	private static String number;
	private static int age;
	int scoreJava, scoreWeb, scoreAndroid;
	
	//접근 제한자
	//public(모두)
	//protected(같은 패키지 => 상속관계 포함 x)
	//private(같은 클래스)
	//default(캍은 패키지 => 상속관계 포함 x)
	
	public int sum() {
		return scoreJava + scoreWeb + scoreAndroid;
	}
	
	public double avg(){
		return Math.ceil(sum()*100/3.0)/100;
	}
	
	public static String getname() {
		return name;
	}
	public static void setname(String name) {
		student.name = name;
	}
	
	public static String getnumber() {
		return number;
	}
	public static void setnumber(String number) {
		student.number = number;
	}
	

	public static int getage() {
		return age;
	}
	public static void setage(int age) {
		student.age = age;
	}
	
	void show() {
		System.out.println(getname() + "님 안녕하세요");
		System.out.println("[ " + getnumber() + ", " + getage() + "세 ]");
		System.out.println(getname() + "님의 Java 점수는 " + scoreJava + "입니다.");
		System.out.println(getname() + "님의 Web 점수는 " + scoreWeb + "입니다.");
		System.out.println(getname() + "님의 Android 점수는 " + scoreAndroid + "입니다.");
		System.out.println("========================================");
	}
}