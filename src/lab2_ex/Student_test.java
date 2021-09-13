package lab2_ex;

public class Student_test {

	public static void main(String[] args) {
		Student a = new Student(17, 2);
		Student b = new Student(18, 1);
		Student c = new Student(15, 3);
		//a객체와 상관없이 b와c객체를 비교함.
		int isBig=a.compare(b, c);
		if(isBig>0) System.out.println("b객체가 c객체보다 큽니다.");
		else if(isBig==0) System.out.println("두 객체의 크기가 같습니다.");
		else System.out.println("b객체가 c객체보다 작습니다.");
	}

}
