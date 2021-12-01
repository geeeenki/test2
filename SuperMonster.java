package rpg1;

public class SuperMonster extends Monster{
	private int poison = 3;
	
	
	SuperMonster(String name, int hp, int at, int df){
		setName(name);
		setHp(hp);
		setAt(at);
		setDf(df);
	}
	
	
	
	
	 void poison_attack(Character ca) {
		 if(this.poison>0) {
			 this.poison--;
			 System.out.println(this.getName() + "は毒攻撃した！");
			 System.out.println(ca.getName() + "に"+this.getAt() + "のダメージを与えた");
			 int hp = ca.getHp()-this.getAt();
			 if(hp<=0) {
				 ca.setHp(0);
			 }else{
				 ca.setHp(hp);
				 
			 }
			 
		 }else if(this.poison<=0){
			 throw new IllegalArgumentException("毒攻撃出来ません。");
			 
		 }
		 System.out.println();
	}

}
