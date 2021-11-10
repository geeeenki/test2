package rpg1;

public class SuperMonster extends Monster{
	protected int poison = 3;
	protected int superAttackGage;
	
	
	SuperMonster(){}
	
	SuperMonster(Monster m){
		this.superAttackGage = m.attackGage;
	}
	
	 void poison_attack() {
		 if(this.superAttackGage>0) {
			 System.out.println(this.getName() + "の毒攻撃した！");
			 this.poison--;
		 }else if((poison<=0)||(this.superAttackGage<=0)){
			 throw new IllegalArgumentException("毒攻撃出来ません。");
			 
		 }
	}

}
