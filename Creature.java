package rpg1;

public abstract class Creature {
	private String name;
	protected int hp;
	private int at;
	protected int df;
	
	public String getName() {
		return name;
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
		return hp;
	}
	public int setHp(int hp) {
		if(hp<0) {
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.hp = hp;
	}
	
	public int getAt() {
		return at;
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
	
	
	public abstract void attack(Character ca);
	
	public void defense() {
		System.out.println(this.getName() + "は守りを固めた！");
		setDf(this.getDf() + 10);
		System.out.println("防御力が10上がった");
	}
	
	

}
