package com.onesoft.day2;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="samsung";
		mobile1.price=15000;
		mobile1.color="white";
		mobile1.ram=4;
		mobile1.isWarranty=true;
		mobile1.discountAmount=1200;
		mobile1.netPrice=mobile1.price-mobile1.discountAmount;
		
		Mobile mobile2=new Mobile();
		mobile2.brand="nokia";
		mobile2.price=20000;
		mobile2.color="black";
		mobile2.ram=8;
		mobile2.isWarranty=true;
		mobile2.discountAmount=1200;
		mobile2.netPrice=mobile2.price-mobile2.discountAmount;
		
		Mobile mobile3=new Mobile();
		mobile3.brand="Redme";
		mobile3.price=25000;
		mobile3.color="red";
		mobile3.ram=16;
		mobile3.isWarranty=true;
		mobile3.discountAmount=1200;
		mobile3.netPrice=mobile3.price-mobile3.discountAmount;
		
		System.out.println("Brand ="+mobile1.brand+" ,Netprice ="+mobile1.netPrice);
		System.out.println("Brand ="+mobile2.brand+" ,Netprice ="+mobile2.netPrice);
		System.out.println("Brand ="+mobile3.brand+" ,Netprice ="+mobile3.netPrice);
		
	}

}
