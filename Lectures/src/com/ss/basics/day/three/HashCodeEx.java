package com.ss.basics.day.three;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "John");
		Person p2 = new Person(1,"David");
		
		if(p1.equals(p2)) {
			System.out.println("same person");
		}else {
			System.out.println("Diff person");
		}
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		p1.setEmpId(2);
		if(p1.equals(p2)) {
			System.out.println("same person");
		}else {
			System.out.println("Dif person");
		}
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
