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
	
	
	public void attack(Character ca) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(ca.getName() +"に"+this.getAt() + "のダメージを与えた");
		int hp = ca.getHp()-this.getAt();
		if(hp<=0) {
			ca.setHp(0);
		}else {
			ca.setHp(hp);
		}
		
		System.out.println();
		
	}
	
	
}
