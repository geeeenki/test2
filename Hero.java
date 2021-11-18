package rpg1;

public class Hero extends Character{
	
	
	public int getDf() {
		return this.df;
	}
	public int setDf(int df) {
		if(df<0) {
			throw new IllegalArgumentException("負の数は入力できません.");
		}
		return this.df = df;
	}
	
	Hero(){
	}
	Hero(String name ,int hp){
		setName(name);
		setHp(hp);
	}
	 Hero(String name, int hp, int at){
		setName(name);
		setHp(hp);
		setAt(at);
	}

	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(m.getName()+"にダメージを" + getAt() + "与えた");
		int hp = m.getHp()-this.getAt();
		if(hp<=0) {
			m.setHp(0);
		}else {
			m.setHp(hp);
		}
	}
	public void attack(SuperMonster c) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(c.getName()+"にダメージを" + getAt() + "与えた");
		int hp = c.getHp()-this.getAt();
		if(hp<=0) {
			c.setHp(0);
		}else {
			c.setHp(hp);
		}
		
		
	}
	public void defense() {
		System.out.println("勇者が防御した");
		this.df = this.getDf() + 10;
		System.out.println("勇者が防御力が10UPし、" + this.getDf() + "になった");
	}
	void heal() {
		System.out.println("勇者が回復した");
		this.hp = this.getHp() + 10;
		System.out.println("HPが10回復し、"+ this.getHp() + "になった");
	}
	
	

}
