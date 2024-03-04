package com.tap;

class Plane
{
	void takeOff() 
	{
		System.out.println("Plane is takeOff");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land() 
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane 
{
	void fly() 
	{
		System.out.println("CargoPlane is "+" flying at low height");
	}
	void carryCargo() 
	{
		System.out.println("CargoPlane is carrying cargo");
	}
}
class PassengerPlane extends Plane 
{
	void fly() 
	{
		System.out.println("PassengerPlane is "+" flying at medium height");
	}
	void carryPassenger() 
	{
		System.out.println("PassengerPlane is carrying passengers");
	}
	
}
class FighterPlane extends Plane 
{
	void fly() 
	{
		System.out.println("FighterPlane is "+" flying at great height");
	}
	void carryWeapons()
	{
		System.out.println("FighterPlane is carrying weapons");
	}
	
}
class Airport 
{
	void permit(Plane ref) 
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
		
	}

}
