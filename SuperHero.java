package rpg1;

public class SuperHero extends Hero {
	private int superAt ;
	
	SuperHero(){}
	SuperHero(Hero h){
		this.superAt = h.getAt()*2;
	}
	SuperHero(String name, int hp, int at,int df){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
	}
	
	public int getSuperAt() {
		return this.superAt;
	}
	public void attack(Creature cr){
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(cr.getName() + "にダメージを合計" + this.getSuperAt() + "与えた");
		int hp = cr.getHp()-this.getSuperAt();
		if(hp<=0) {
			cr.setHp(0);
		}else {
			cr.setHp(hp);
		}
		
		System.out.println();
	}
	

}
