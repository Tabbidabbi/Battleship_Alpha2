package Gameobjects.Ships;

import java.io.Serializable;

public class Corvette extends Ship implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 3219828611685870243L;
	
	String name = "Korvette";
	
	//Korvette positioniert 
	
	public Corvette(int number){
		super("C", 3, false, number, false, 1, 0, 1, "Korvette");
		
	}

	//Getter und Setter Methoden
	
    @Override
	public String getName() {
		return name;
	}

    @Override
	public void setName(String name) {
		this.name = name;
	}

}
