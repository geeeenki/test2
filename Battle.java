package rpg1;

public class Battle {
	
	public static void battle(Character[] ca, Creature[] cr ) {
		boolean x = true;
		while(x) {
			ca[0].attack(cr[0]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			cr[1].attack(ca[0]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			ca[2].attack(cr[1]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			cr[0].attack(ca[1]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			if(ca[3] instanceof SuperMagician) {
				SuperMagician c = (SuperMagician)ca[3];
				c.super_mat(cr[1]);
				hp(ca,cr);
				if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
					System.out.println("ヒーローは全滅した");
					break;
				}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
					System.out.println("モンスターは全滅した");
					break;
				}
			}
			
			ca[0].attack(cr[0]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			ca[0].attack(cr[1]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			ca[0].attack(cr[1]);
			hp(ca,cr);
			if(ca[0].getHp()==0&&ca[1].getHp()==0&&ca[2].getHp()==0&&ca[3].getHp()==0) {
				System.out.println("ヒーローは全滅した");
				break;
			}else if(cr[0].getHp()==0&&cr[1].getHp()==0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			
			
			
			
			
		}
		
		
	
	}
	
	 public static void hp(Character[] ca,Creature[] cr) {
			for(Character cara : ca) {
				System.out.println(cara.getName()+"の残りHP　："+cara.getHp());
			}
			for(Creature cre : cr) {
				System.out.println(cre.getName()+"の残りHP　："+cre.getHp());
			}
			for(int i = 0; i<ca.length; i++) {
				if(ca[i].getHp()==0) {
					System.out.println(ca[i].getName()+"は倒された");
				}else {
					break;
				}
			}for(int i = 0; i<cr.length; i++) {
				if(cr[i].getHp()==0) {
					System.out.println(cr[i].getName()+"は倒された");
				}else {
					break;
				}
			}
			
			
			System.out.println();
			System.out.println();
		}
	 
	 
	

}
