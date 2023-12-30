package org.bike;

public class Car implements Bike
{
	@Override
	public void cost() 
	{
		System.out.println("Bike cost: 1.5Lakhs");	
		
	}
	@Override
	public void speed() 
	{
		System.out.println("Speed 300+kmph");	
		
	}
	public void carcost()
	{
		System.out.println("Car cost: 10Lakhs");	
	}
	public void carspeed()
	{
		System.out.println("Speed 450+kmph");	
	}
	public static void main(String[] args) 
	{
		Car cr=new Car();
		cr.cost();
		cr.speed();
		cr.carcost();
		cr.carspeed();
	}
	

}
