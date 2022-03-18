package OOPExample;

import Characteristics.Polite;
import Characteristics.Respectful;

public class Employee extends Human implements Respectful, Polite {
	
	private int ID;
	private int salary;
	private int bankAccountnumber;
	private final int gentleMaxLevel = 100;
	private int gentleLevel;
	
	public String getName() {
		return name;
	}
	
	public Employee(int iD, int salary, int bankAccountnumber) {
		ID = iD;
		this.salary = salary;
		this.bankAccountnumber = bankAccountnumber;
	}
	
	public Employee(String name) {
		super.name = name; 
	}

	public Employee(int iD) {
		ID = iD;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBankAccountnumber() {
		return bankAccountnumber;
	}
	
	public void setBankAccountnumber(int bankAccountnumber) {
		this.bankAccountnumber = bankAccountnumber;
	}
	
	public void setHumanSpeed(int aSpeed) throws Exception  
	{ 
		if(aSpeed <= 50) {
			super.SPEED = aSpeed;
		}else if(aSpeed >= 50 ) {
			throw new HumanSpeedLimitException("Your speed limit is too High. Please go slower"); 
		}	
	}
	
	public int getHumanSpeed() {
		return super.getSPEED();
	}
 
	public void setGentleLevel(int level) {
		if(level <= 100) {
			this.gentleLevel = level;
		}else if(level >= 100 ) {
			  System.out.println("You cannot exceed the level of gentleness... Too good to be true!!!");  
		}	
	}
	 
	public boolean isGentle() {
		
		boolean ok = false;
		
		switch (gentleLevel) {
		case 90:
			 ok = true;
			 break;
		case 80:
			 ok = true;
			 break;
		case 70:
			 ok = true;
			 break;
		case 60:
			 ok = true;
			 break;
		case 50:
			 ok = true;
			 break;
		case 40:
			 ok = false;
			 break;
		case 30:
			 ok = false;
			 break;
		case 20:
			 ok = false;
			 break;
		case 10:
			 ok = false;
			 break;
		}
		return ok ; 
	}
 
	public void sayHello() {
		System.out.println("Hello there...");
		
	}
 
	public void sayGoodBye() {
		System.out.println("bye bye...");
		
	}

	

	
}
