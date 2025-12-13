package com.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class StudentDetails{
	int id;
	String name;
	int age;
	public StudentDetails(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class GroupingBy1 {
	public static void main(String[] args) {
		
		List<StudentDetails> stdData =  new ArrayList<>();
		stdData.add(new StudentDetails(1,"balu",36));
		stdData.add(new StudentDetails(2,"yugal",28));
		stdData.add(new StudentDetails(3,"mayur",25));
		stdData.add(new StudentDetails(4,"pramod",36));
		stdData.add(new StudentDetails(5,"bhagawan",56));
		stdData.add(new StudentDetails(6,"kiran",56));
		stdData.add(new StudentDetails(7,"radha",28));
		stdData.add(new StudentDetails(8,"leena",15));
		
		Map<Integer, List<StudentDetails>> stdMap=stdData.stream().collect(Collectors.groupingBy(s->s.getAge()));
		System.out.println(stdMap);
		
		Map<Integer,Set<String>> stdSet=stdData.stream().collect(Collectors.groupingBy(StudentDetails::getAge,Collectors.mapping(StudentDetails::getName, Collectors.toSet())));
		System.out.println(stdSet);
		
		Map<Integer,List<String>> stdList=stdData.stream().collect(Collectors.groupingBy(s->s.getAge(),Collectors.mapping(StudentDetails::getName, Collectors.toList())));
		System.out.println(stdList);
		
		
		HashMap<Integer, List<String>> stdHashMap1=stdData.stream().collect(Collectors.groupingBy(s->s.getAge(), HashMap::new, Collectors.mapping(StudentDetails::getName , Collectors.toList())));
		System.out.println(stdHashMap1);
		
		Hashtable<Integer, List<String>> stdHashTable=stdData.stream().collect(Collectors.groupingBy(s->s.getAge(), Hashtable::new, Collectors.mapping(StudentDetails::getName , Collectors.toList())));
		System.out.println(stdHashTable);
		
		HashMap<Integer, List<String>> stdHashMap2=stdData.stream().collect(Collectors.groupingBy(s->s.getAge(), ()->new HashMap<>(), Collectors.mapping(StudentDetails::getName , Collectors.toList())));
		System.out.println(stdHashMap2);
		
		Map<Integer, Long> stdCount = stdData.stream().collect(Collectors.groupingBy(s->s.getAge(), Collectors.counting()));
		System.out.println(stdCount);
		
		Map<Integer, Integer> StdSum = stdData.stream().collect(Collectors.groupingBy(s->s.getAge(), Collectors.summingInt(StudentDetails::getAge)));
		System.out.println(StdSum);



		////////////sort it

	}

}





























