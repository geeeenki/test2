package rpg1;

public class SuperMonster extends Monster{
	protected int poison = 3;
	
	
	SuperMonster(){}
	
	SuperMonster(Monster m){
	}
	
	
	
	 void poison_attack() {
		 if(this.poison>0) {
			 this.poison--;
			 System.out.println(this.getName() + "の毒攻撃した！"+this.poison);
			 
		 }else if(this.poison<=0){
			 throw new IllegalArgumentException("毒攻撃出来ません。");
			 
		 }
	}

}
