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
	
	public int getMagicCount() {
		return this.magicCount;
	}
	public int setMagicCount(int magicCount) {
		return this.magicCount = magicCount;
	}
	
	Magician(){
		
	}
	Magician(String name, int hp, int at,int df,int mp){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
		setMp(mp);
	}
	
	
	
	void mheal() {
		System.out.println(this.getName() + "の回復魔法!");
		this.mp = this.getMp() - this.getMagicCount();
		this.hp = this.getHp() + 20;
		System.out.println("魔法使いはHPを20回復し、" + this.hp +"になった");
		System.out.println();
	}
	void heal() {
		System.out.println(this.getName() +"が回復した");
		this.hp = this.getHp() + 10;
		System.out.println("HPが10回復し、"+ this.hp +"になった");
		System.out.println();
	}
	@Override
	public void attack(Creature cr) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName() + "の魔法攻撃!");
		this.mp = this.getMp() - this.getMagicCount();
		System.out.println(cr.getName()+"にダメージを"+this.getAt()+"与えた");
		int hp = cr.getHp()-this.getAt();
		if(hp<=0) {
			cr.setHp(0);
		}else {
			cr.setHp(hp);
		}
		System.out.println();
	}
	
	
	

}
