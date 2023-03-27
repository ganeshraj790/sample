package com.onesoft.day2;

public class UseFridge {
	public static void main(String[]args) {
		Fridge fridge1=new Fridge();
		fridge1.brand="LG";
		fridge1.price=25000;
		fridge1.model="doubleDore";
		fridge1.isDoubledore=true;
		fridge1.taxpercentage=15;
		fridge1.discountpercentage=20;
		fridge1.taxamount=fridge1.price*fridge1.taxpercentage/100;
		fridge1.discountamount=fridge1.price*fridge1.discountpercentage/100;
		fridge1.netprice=fridge1.price+fridge1.taxamount-fridge1.discountamount;
		System.out.println("Brand="+fridge1.brand+"  \nNetprice="+fridge1.netprice);
	}

}
