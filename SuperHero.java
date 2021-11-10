package rpg1;

public class SuperHero extends Hero {
	
	SuperHero(){}
	SuperHero(Hero h){
		
	}
	void attack(){
		super.attack();
		super.attack();
		System.out.println(this.getName() + "は2回攻撃した!");
		System.out.println("敵にダメージを合計" + (this.getAt()*2) + "与えた");
	}

}
