package rpg1;

public class SuperHero extends Hero {
	private int superAt ;
	
	SuperHero(){}
	SuperHero(Hero h){
		this.superAt = h.getAt()*2;
	}
	
	public int getSuperAt() {
		return this.superAt;
	}
	void attack(Monster m){
		super.attack(m);
		super.attack(m);
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(m.getName() + "にダメージを合計" + this.getSuperAt() + "与えた");
		int hp = m.getHp()-this.getSuperAt();
		if(hp<=0) {
			m.setHp(0);
		}else {
			m.setHp(hp);
		}
	}
	void attack(SuperMonster c){
		super.attack(c);
		super.attack(c);
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(c.getName() + "にダメージを合計" + this.getSuperAt() + "与えた");
		int hp = c.getHp()-this.getSuperAt();
		if(hp<=0) {
			c.setHp(0);
		}else {
			c.setHp(hp);
		}
	}

}
