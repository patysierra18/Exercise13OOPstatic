package com.exercise13oopstatic.model;

public class Car {
	
	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe=false;
	
	public Car()
	{	
	}
	public Car(String serialNumber, int numberDoors)
	{
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
	}
	
	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}
	public int get NumberDoors()
	{
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors)
	{
		this.numberDoors = numberDoors;
	}
	public void carIsCoupe(boleean isCoupe)
	{
		this.isCoupe= isCoupe;
	}
}
