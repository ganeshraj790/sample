package com.onesoft.day2;

public class UseStudent {
	public static void main(String[]args) {
		Student student1=new Student();
		student1.name="ganesh";
		student1.examnumber=123;
		student1.tamilmark=80;
		student1.englishmark=80;
		student1.biologymark=80;
		student1.mathsmark=80;
		student1.physicsmark=80;
		student1.chemistrymark=80;
		student1.totalmark=student1.tamilmark+student1.englishmark+student1.biologymark+student1.mathsmark+student1.physicsmark+student1.chemistrymark;
		student1.average=student1.totalmark/6;
		
		Student student2=new Student();
		student2.name="Rajan";
		student2.examnumber=456;
		student2.tamilmark=85;
		student2.englishmark=86;
		student2.biologymark=87;
		student2.mathsmark=82;
		student2.physicsmark=81;
		student2.chemistrymark=75;
		student2.totalmark=student2.tamilmark+student2.englishmark+student2.biologymark+student2.mathsmark+student2.physicsmark+student2.chemistrymark;
		student2.average=student2.totalmark/6;
		System.out.println("Name ="+student1.name+"  Average ="+student1.average);
		System.out.println("Name ="+student2.name+"  Average ="+student2.average);
		
	}

}
