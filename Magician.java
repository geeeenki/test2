package rpg1;

public class Magician extends Character{
	
	protected int mp;
	private int magicAt;
	private int magicCount = 5;
	
	
	
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
	
	
	public void attack(Monster m) {
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
	
	public void attack(SuperMonster c) {
		System.out.println(this.getName() + "の魔法攻撃!");
		this.mp = this.getMp() - this.getMagicCount();
		System.out.println(c.getName()+"にダメージを"+this.getMagicAt()+"与えた");
		int hp = c.getHp()-this.getMagicAt();
		if(hp<=0) {
			c.setHp(0);
		}else {
			c.setHp(hp);
		}
	}
	void mheal() {
		System.out.println(this.getName() + "の回復魔法!");
		this.mp = this.getMp() - this.getMagicCount();
		this.hp = this.getHp() + 20;
		System.out.println("魔法使いはHPを20回復し、" + this.hp +"になった");
	}
	void heal() {
		System.out.println(this.getName() +"が回復した");
		this.hp = this.getHp() + 10;
		System.out.println("HPが10回復し、"+ this.hp +"になった");
	}
	@Override
	public void defense() {
		System.out.println(this.getName()+"が防御した");
		this.df = this.getDf() + 10;
		System.out.println("勇者が防御力が10UPし、" + this.getDf() + "になった");
	}
	
	

}
