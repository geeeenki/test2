package rpg1;

public class SuperMagician extends Magician{
	private String  superMagicName;
	private int superMagicMp; 
	private int superMagicHp;
	private int superMagicAt;
	private int superMagicCount;
	
	SuperMagician(){
		
	}
	SuperMagician(Magician mg){
		this.superMagicHp = mg.getHp()+10;
		this.superMagicMp = mg.getMp()+50;
		this.superMagicAt = mg.getMagicAt()*2;
		this.superMagicCount = mg.getMagicCount()*2;
	}
	
	public String getSuperMagicName() {
		return this.superMagicName;
	}
	public String setSuperMagicName(String superMagicName) {
		return this.superMagicName = superMagicName;
	}
	public int getSuperMagicHp() {
		return this.superMagicHp;
	}
	
	public int getSuperMagicMp() {
		return this.superMagicMp;
	}
	public int getSuperMagicAt() {
		return this.superMagicAt;
	}
	public int getSuperMagicCount() {
		return this.superMagicCount;
	}
	void super_mat() {
		System.out.println(this.getSuperMagicName() + "の超攻撃魔法!");
		this.superMagicMp = getSuperMagicMp()-getSuperMagicCount();
		System.out.println("敵にダメージを"+getSuperMagicAt()+"与えた");
		System.out.println("残りの魔力　" + this.getSuperMagicMp());
	}

}
