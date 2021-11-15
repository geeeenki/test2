package rpg1;

public class SuperMonster extends Monster{
	protected int poison = 3;
	
	
	SuperMonster(){}
	
	SuperMonster(Monster m){
		
	}
	
	
	
	 void poison_attack(Hero h) {
		 if(this.poison>0) {
			 this.poison--;
			 System.out.println(this.getName() + "は毒攻撃した！");
			 System.out.println(h.getName() + "に"+this.getAt() + "のダメージを与えた");
			 int hp = h.getHp()-this.getAt();
			 if(hp<=0) {
				 h.setHp(0);
			 }else{
				 h.setHp(hp);
				 
			 }
			 
		 }else if(this.poison<=0){
			 throw new IllegalArgumentException("毒攻撃出来ません。");
			 
		 }
	}

}
