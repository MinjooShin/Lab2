package lab2_ex;
import java.util.Comparator;
/*
Student 클래스 객체 비교 -> Student 클래스에 Comparable implements 해야함. 
Student 객체와 또 다른 Student 객체를 비교 -> <Student>
*/
public class Student implements Comparator<Student>{
	int age;
	int classNumber;
	
	Student(int age, int classNumber){
		this.age=age;
		this.classNumber=classNumber;
	}
	
	/*
	@Override
	public int compareTo(Student o) { //값을 비교해서 정수를 반환 -> this.age - o.age = ?
		if(this.age>o.age) return 1; //자기 자신의 age가 o의 age보다 클 경우(양수)
		else if(this.age==o.age) return 0; //같을 경우(0)
		else return -1; //작을 경우(음수)
	}
	*/
	
	//위의 compareTo를 간단하게 줄인 코드
	@Override
	public int compare(Student o1, Student o2) {return o1.age-o2.age;}
	
	
	
}
