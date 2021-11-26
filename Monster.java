package rpg1;

public class Monster extends Creature{
	
	
	
	
	Monster(){
		
		
	}
	Monster(String name, int hp, int at, int df){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
	}
	
	
	public void attack(Hero h) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(h.getName() +"に"+this.getAt() + "のダメージを与えた");
		int hp = h.getHp()-this.getAt();
		if(hp<=0) {
			h.setHp(0);
		}else {
			h.setHp(hp);
		}
		
	}
	public void attack(SuperHero a) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(a.getName() +"に"+this.getAt() + "のダメージを与えた");
		int hp = a.getHp()-this.getAt();
		if(hp<=0) {
			a.setHp(0);
		}else {
			a.setHp(hp);
		}
		
	}
	public void attack(Magician mg) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(mg.getName() +"に"+this.getAt() + "のダメージを与えた");
		int hp = mg.getHp()-this.getAt();
		if(hp<=0) {
			mg.setHp(0);
		}else {
			mg.setHp(hp);
		}
		
	}
	public void attack(SuperMagician b) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(b.getName() +"に"+this.getAt() + "のダメージを与えた");
		int hp = b.getHp()-this.getAt();
		if(hp<=0) {
			b.setHp(0);
		}else {
			b.setHp(hp);
		}
	}
	
}
