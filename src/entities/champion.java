package entities;

public class champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void champion(String name, int damage, int armor) {
		this.armor = armor;
		this.attack = attack;
		this.life = life;
		this.name = name;

	}

	public void takeDamage(champion other) {
		int damage = other.attack - this.armor;
		this.life += - damage;
	}

	public String status() {
		if (this.life <= 0) {
			return this.name
			   + ": "
			   + "0 of life (dead)";
				}else {
					return this.name
							+ ": "
							+ String.format("%d", this.life)
							+ "of life";
		}
		
	}

}
