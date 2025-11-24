package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	protected AbstractMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	protected String getName() {
		return name;
	}
	protected int getHp() {
		return hp;
	}
	protected int getAttack() {
		return attack;
	}
	protected int getDefense() {
		return defense;
	}
	
	public boolean defense(int dmg) {
		if(defense > dmg) {
			return true;
		}
		hp -= dmg - defense;
		return false;
	}
	public abstract int attack();
}
