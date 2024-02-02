package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	
	public Champion(String name, int life, int attack, int armor) {
		setName(name);
		setLife(life);
		setAttack(attack);
		setArmor(armor);
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLife(int life) {
		this.life = life;
	}
	
	public int getLife() {
		return this.life;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		int def = (other.attack - this.armor);
		
		if (def > 0) {
			this.life = this.life - def;
		}
		else {
			this.life--;
		return;
		}
	}

	public String status() {
		
		 String status = name + ": " 
					+ String.format("%d ",(life > 0)?this.life : 0) 
					+ "de vida";  
				
		if (life <= 0 ) {
		    status = status + " (morreu)";  
		}
		
		
	return status;
	}
}
