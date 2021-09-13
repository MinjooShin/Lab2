package lab2_student;

import java.util.*;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(1, "Kim", 23);
		al.add(s1);
		Student s2=new Student(2, "Choi", 21);
		al.add(s2);
		al.add(new Student(3, "Park", 25));
		al.add(new Student(4, "Shin", 26));
		al.add(new Student(5, "Jang", 28));
		al.add(new Student(6, "David", 30));
		al.add(new Student(7, "Daniel", 31));
		al.add(new Student(8, "Juli", 29));
		al.add(new Student(9, "Kelly", 18));
		al.add(new Student(10, "Jimmy", 19));
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
