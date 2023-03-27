package com.onesoft.day2;

public class UseMarker {
	public static void main(String[]args) {
		Marker marker1=new Marker();
		marker1.brand="cello";
		marker1.price=50;
		marker1.colour="block";
		marker1.isRefillable=false;
		Marker marker2=new Marker();
		marker2.brand="dome";
		marker2.price=60;
		marker2.colour="red";
		marker2.isRefillable=true;
		System.out.println("Brand ="+marker1.brand+" ,price="+marker1.price+" ,colour="+marker1.colour+" ,Is Refillable="+marker1.isRefillable);
		System.out.println("Brand ="+marker2.brand+" ,price="+marker2.price+" ,colour="+marker2.colour+" ,Is Refillable="+marker2.isRefillable);
	}

}
