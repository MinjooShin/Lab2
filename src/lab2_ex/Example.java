package lab2_ex;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String name;
	int math;
	
	System.out.print("이름은?");
	name=s.next();
	System.out.print("수학 점수는?");
	math=s.nextInt();
	System.out.println(name+": "+math);
	}
}
