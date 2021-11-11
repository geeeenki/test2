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
	void attack(String name){
		super.attack();
		super.attack();
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println(name + "にダメージを合計" + this.getSuperAt() + "与えた");
	}

}
