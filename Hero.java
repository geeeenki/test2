package rpg1;

public class Hero extends Character{
	
	
	
	
	Hero(){
	}
	Hero(String name ,int hp){
		setName(name);
		setHp(hp);
	}
	 Hero(String name, int hp, int at,int df){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
	}

	public void attack(Creature[] cr) {
		if(cr[0] instanceof Monster) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(cr[0].getName()+"にダメージを" + getAt() + "与えた");
		int hp = cr[0].getHp()-this.getAt();
		if(hp<=0) {
			cr[0].setHp(0);
		}else {
			cr[0].setHp(hp);
		}
		}
	}
	
	
	void heal() {
		System.out.println("勇者が回復した");
		setHp(this.getHp() + 10);
		System.out.println("HPが10回復し、"+ this.getHp() + "になった");
	}
	
	
	

}
