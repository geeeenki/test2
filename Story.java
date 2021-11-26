package rpg1;

public class Story {


	public static void main(String[] args) {
	
		
		Character[] ca = new Character[4];
		
		ca[0]= new Hero("勇者１",100,50,50);
		ca[1]= new SuperHero("スーパー勇者",120,50,50);
		ca[2]= new Magician("魔法使い",100,30,50,100);
		if(ca[2] instanceof Magician) {
			Magician mg = (Magician)ca[2];
			ca[3]= new SuperMagician("スーパー魔法使い", mg);
		}
		
		
		Creature[] cr = new Creature[2];
		cr[0]= new Monster("モンスター",100,20,50);
		cr[1]= new SuperMonster("スーパーモンスター",150,30,50);
		
		
		for(int i = 0; i<ca.length; i++) {
			System.out.println(ca[i].getName()+"が誕生した");
			System.out.println("名前　；" + ca[i].getName());
			System.out.println("体力　；" + ca[i].getHp());
			System.out.println("攻撃力　；" + ca[i].getAt());
			System.out.println("防御力　；" + ca[i].getDf());
			if(ca[i] instanceof Magician) {
				Magician mg = (Magician)ca[i];
				if(ca[i].equals(mg)){
					System.out.println("魔力　；" + mg.getMp());
				}
			}else if(ca[i] instanceof SuperMagician) {
				SuperMagician b = (SuperMagician)ca[i];
				 if(ca[i].equals(b)) {
						System.out.println("魔力　；" + b.getMp());
				}
			}
			
			System.out.println();	
		}
		
		for(Creature cre : cr) {
			System.out.println(cre.getName()+"が誕生した");
			System.out.println("名前　；" + cre.getName());
			System.out.println("体力　；" + cre.getHp());
			System.out.println("攻撃力　；" + cre.getAt());
			System.out.println("防御力　；" + cre.getDf());
			System.out.println();	
		}
		
		System.out.println();
		
		
		ca[0].attack(cr[0]);
		
	}
	
	
	
	
	static void mikata_hp(Character[] ca) {
		for(Character cara : ca) {
			System.out.println(cara.getName()+"の残りHP　："+cara.getHp());
		}
	}
	
	static void teki_hp(Creature[] cr) {
		for(Creature cre : cr) {
			System.out.println(cre.getName()+"の残りHP　："+cre.getHp());
		}
	}
	
	static void hanntei(Character[] ca, Creature[] cr) {
		for(int i = 0; i<ca.length; i++) {
			if(ca[i].getHp()==0) {
				System.out.println(ca[i].getName()+"は倒された");
			}else {
				break;
			}
		}
		for(int i = 0; i<cr.length; i++) {
			if(cr[i].getHp()==0) {
				System.out.println(cr[i].getName()+"は倒された");
			}else {
				break;
			}
		}
	}
}

