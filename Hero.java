package rpg1;

public class Hero {
	private String name;
	private int hp;
	private int at;
	private int df; 
	
	
	
	public String getName() {
		return this.name;
	}
	public String setName(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("3文字未満です！");
		}
		if(name.length()>10) {
			throw new IllegalArgumentException("10文字以上です");
		}
		if(name == null) {
			throw new NullPointerException("addressがnullです。");
		}
		return this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	
	public int setHp(int hp) {
		if(hp<0) {
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.hp = hp;
	}
	public int getAt(){
		return this.at;
	}
	public int setAt(int at) { 
		if(at<0) {
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.at = at;
	}
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
	 
	
	void attack() {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println("敵にダメージを" + getAt() + "与えた");
		
	}
	void defense() {
		System.out.println("勇者が防御した");
		this.df = this.getDf() + 10;
		System.out.println("勇者が防御力が10UPし、" + this.getDf() + "になった");
	}
	void heal() {
		System.out.println("勇者が回復した");
		this.hp = this.getHp() + 10;
		System.out.println("HPが10回復し、"+ this.getHp() + "になった");
	}
	
	int hanntei() {
		return -getAt();
	}

}
