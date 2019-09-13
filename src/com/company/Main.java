package com.company;

public class Main {

    public static void main(String[] args) {
        StudentClass name = new StudentClass();
	name.Name = "Rajesh";
	name.ClassName = "Seven D";
	name.RollNumber = 10;
	name.Division = 4;

		System.out.println("Name is : " + name.Name);
		System.out.println("Class name :" + name.ClassName);
		System.out.println( "Roll Number :" + name.RollNumber);
		System.out.println("Division : " + name.Division);

    }
}
