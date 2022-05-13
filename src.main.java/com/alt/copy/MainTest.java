package com.alt.copy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="med";
		p1.age=55;
		Person p2 = new Person();
		p2.name="nsdg";
		p2.age=104;
		Person p3 = new Person();
		p1.name="med";
		p1.age=55;
		Person p4 = new Person();
		p2.name="nsdg";
		p2.age=103;

		List<Person> persones = new ArrayList<Person>();
		
		//Map<Person, Long> collect = persones.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//collect.entrySet().stream().filter(e->e.getValue()>5).collect(Collectors.toSet());
		
		
		
		
		
		
		
		

	}

}
 class Person implements Comparable<Person>{
	
	public String name;
	public int age;
	
	@Override
	public int compareTo(Person o) {	
			if(o.age>this.age) return 1;
			if(o.age<this.age) return -1;
						
		return 0;
	}


	
	
	
	
}
