package rpg1;

public class SuperMonster extends Monster{
	protected int poison = 3;
	
	
	SuperMonster(){}
	
	SuperMonster(Monster m){
	}
	
	
	
	 void poison_attack(String name) {
		 if(this.poison>0) {
			 this.poison--;
			 System.out.println(this.getName() + "は毒攻撃した！");
			 System.out.println(name + "に"+this.getAt() + "のダメージを与えた");
			 
		 }else if(this.poison<=0){
			 throw new IllegalArgumentException("毒攻撃出来ません。");
			 
		 }
	}

}
