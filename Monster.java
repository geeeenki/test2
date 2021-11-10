package rpg1;

public class Monster {
	private String name;
	private int hp;
	private int at;
	private int df;
	
	public String getName() {
		return this.name;
	}
	public String setName(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("3文字未満です!");
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
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.df = df;
	}
	
	Monster(){
		
		
	}
	Monster(String name, int hp){
		setName(name);
		setHp(hp);
	}
	
	protected int attackGage = 0;
	void attack() {
		this.attackGage++;
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(this.getAt() + "のダメージを与えた");
		System.out.println(this.attackGage);
	}
	void defense() {
		System.out.println(this.getName() + "は守りを固めた！");
		this.df = this.getDf() + 10;
		System.out.println("防御力が10上がった");
	}
}
