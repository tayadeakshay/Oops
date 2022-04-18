package com.oops.encapsulation;

public class Test {

	public static void main(String[] args) {

		Encapsulate e1 = new Encapsulate();
		
		e1.setRollNo(10);
		e1.setName("Ram");
		e1.setAge(20);
		
//		System.out.println("Students rollNo: "+ e1.getRollNo());
//		System.out.println("Students Name: "+ e1.getName());
//		System.out.println("Student age: "+ e1.getAge());
		
		System.out.printf("%-20s%03d \n","Students rollNo: ",e1.getRollNo());
		System.out.printf("%-20s%-10s \n","Students Name: ",e1.getName());
		System.out.printf("%-20s%03d \n","Student age: ",e1.getAge());
	}

}
