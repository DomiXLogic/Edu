package OOPExample;

public abstract class Human {

	private int height;
	private int weight;
	public  String name;
	private String LName;
	protected  int SPEED = 50;
	private int sex ;
	
	protected int getSPEED() {
		return SPEED;
	}

	public void setSPEED(int sPEED) {
		this.SPEED = sPEED;
	}
	
	public Human() {}       //Default Constructor  
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}
	
	public void startRunning()
	{
		System.out.println("Iam running.. ");
	}
	private void startWalking() {
		System.out.println("I am walking.. ");
	}

}
