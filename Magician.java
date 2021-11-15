package rpg1;

public class Magician {
	private String name;
	private int hp;
	protected int mp;
	private int magicAt;
	private int magicCount = 5;
	
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
	
	public int getMp() {
		return this.mp;
	}
	public int setMp(int mp) {
		if(mp<0) {
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.mp = mp;
	}
	public int getMagicAt() {
		return this.magicAt;
	}
	public int setMagicAt(int magicAt) {
		if(magicAt<0) {
			throw new IllegalArgumentException("負の数は入力できません");
		}
		return this.magicAt = magicAt;
	}
	public int getMagicCount() {
		return this.magicCount;
	}
	
	Magician(){
		
	}
	Magician(String name, int hp){
		setName(name);
		setHp(hp);
	}
	
	
	void mat(Monster m) {
		System.out.println(this.getName() + "の魔法攻撃!");
		this.mp = this.getMp() - this.getMagicCount();
		System.out.println(m.getName()+"にダメージを"+this.getMagicAt()+"与えた");
		int hp = m.getHp()-this.getMagicAt();
		if(hp<=0) {
			m.setHp(0);
		}else {
			m.setHp(hp);
		}
	}
	void mheal() {
		System.out.println(this.getName() + "の回復魔法!");
		this.mp = this.getMp() - this.getMagicCount();
		this.hp = this.getHp() + 20;
		System.out.println("魔法使いはHPを20回復し、" + this.hp +"になった");
	}
	void heal() {
		System.out.println("魔法使いが回復した");
		this.hp = this.getHp() + 10;
		System.out.println("HPが10回復し、"+ this.hp +"になった");
	}
	

}
