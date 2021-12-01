package rpg1;

public class SuperMagician extends Magician{
	
	
	SuperMagician(){
	
	}
	SuperMagician(String name,Magician mg){
		setName(name);
		setHp(mg.getHp()+10);
		setAt(mg.getAt()*2);
		setDf(mg.getDf()+10);
		setMp(mg.getMp()+50);
		setMagicCount(mg.getMagicCount()*2);
	}
	SuperMagician(String name){
		setName(name);
		
	}
	
	
	
	void super_mat(Creature cr) {
		System.out.println(this.getName() + "の超攻撃魔法!");
		this.mp = getMp()-getMagicCount();
		System.out.println(cr.getName()+"にダメージを"+getAt()+"与えた");
		System.out.println("残りの魔力　" + this.getMp());
		int hp = cr.getHp()-this.getAt();
		if(hp<=0) {
			cr.setHp(0);
		}else {
			cr.setHp(hp);
		}
		
		System.out.println();
	}
	
	

}
