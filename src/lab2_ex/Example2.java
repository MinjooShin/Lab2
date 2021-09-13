package lab2_ex;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		System.out.println("리스트 크기:"+list.size());
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();
		for(int i=0; i<list.size(); i++) System.out.println(list.get(i));
		
		System.out.println();
		for(Integer n:list) System.out.println(n);
		
		System.out.println();
		list.set(0, 1); //100->1
		System.out.println(list);
		
		System.out.println();
		list.remove(2);
		System.out.println("size="+list.size());
		System.out.println(list);
	}

}
