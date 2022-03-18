package OOPExample;


public class HumanTest {

	public static void main(String[] args) {
		
		Human h2 = new Employee(13); 
  		
		//Human h3 = new Human(); 
		
		System.out.println(h2.getName());
		h2.setName("Basilis");
		System.out.println(h2.getName());
		
		Employee e1 = new Employee(3001, 2000, 43232);
		 
		Employee e2 = new Employee("Kyr"); 
		
		System.out.println(e2.getName());
		
		try {
			e1.setHumanSpeed(60);
			System.out.println("The speed of e1 is " + e1.getHumanSpeed());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		e1.setGentleLevel(70);

		if(e1.isGentle()) {
			System.out.println("Well done");
		}else
			System.out.println("You are rude.. ");
		
		
		Level lvl = Level.MEDIUM; 
		
		switch (lvl)
		{
		case LOW: 
			System.out.println("Low Level ");
			break;
		case MEDIUM: 
			System.out.println("Medium Level ");
			break;
		case HIGH: 
			System.out.println("High Level ");
			break;
		}

	}

}
