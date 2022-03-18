package OOPExample;

public class Employeer extends Human {
	
	private int ID;
	private int salary;
	private int bankAccountnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	public Employeer(int iD, int salary, int bankAccountnumber) {
		ID = iD;
		this.salary = salary;
		this.bankAccountnumber = bankAccountnumber;
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

}
