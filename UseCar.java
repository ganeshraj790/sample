package com.onesoft.day2;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="Ford";
		car1.price=300000;
		car1.color="block";
		car1.isTubeless=true;
		car1.netprice=car1.price+(car1.price*20/100);
		
		Car car2=new Car();
		car2.brand="BMW";
		car2.price=600000;
		car2.color="white";
		car2.isTubeless=true;
		car2.netprice=car2.price+(car2.price*20/100);
		System.out.println("Brand ="+car1.brand+"  Netprice ="+car1.netprice);
		System.out.println("Brand ="+car2.brand+"  Netprice ="+car2.netprice);
	}

}
