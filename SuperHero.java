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
	public void attack(Monster m){
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(m.getName() + "にダメージを合計" + this.getSuperAt() + "与えた");
		int hp = m.getHp()-this.getSuperAt();
		if(hp<=0) {
			m.setHp(0);
		}else {
			m.setHp(hp);
		}
	}
	public void attack(SuperMonster c){
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(c.getName() + "にダメージを合計" + this.getSuperAt() + "与えた");
		int hp = c.getHp()-this.getSuperAt();
		if(hp<=0) {
			c.setHp(0);
		}else{
			c.setHp(hp);
		}
	}

}
