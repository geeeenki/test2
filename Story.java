package rpg1;

//import java.util.Scanner;
public class Story {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner scan = new Scanner(System.in);
		
		Hero h = new Hero();
		//System.out.println("勇者の名前を設定してください");
		//h.name = scan.nextLine();
		
		//System.out.println("勇者の体力を設定してください");
		//h.hp = scan.nextInt();
		
		//System.out.println("勇者の攻撃力を設定してください");
		//h.at = scan.nextInt();		
		h.setName("勇者１");
		h.setHp(100);
		h.setAt(50);
		h.setDf(50);
		
		System.out.println("勇者が誕生した");
		System.out.println("名前　；" + h.getName());
		System.out.println("体力　；" + h.getHp());
		System.out.println("攻撃力　；" + h.getAt());
		System.out.println("防御力　；" + h.getDf());
		System.out.println();
		
		
		//Scanner scan2 = new Scanner(System.in);
		
		Monster m = new Monster();
		//System.out.println("モンスターの名前を設定してください");
		//m.name = scan2.nextLine();
		
		//System.out.println("モンスターの体力を設定してください");
		//m.hp = scan2.nextInt();
		
		//System.out.println("モンスターの攻撃力を設定してください");
		//m.at = scan2.nextInt();
		
		//System.out.println("モンスターの防御力を設定してください");
		//m.df = scan2.nextInt();
		m.setName("モンスター");
		m.setHp(100);
		m.setAt(10);
		m.setDf(100);
		
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前　；" + m.getName());
		System.out.println("体力　；" + m.getHp());
		System.out.println("攻撃力　；" + m.getAt());
		System.out.println("防御力　；" + m.getDf());
		System.out.println();
		
		
		//Scanner scan3 = new Scanner(System.in);
		
		Magician mg = new Magician("ブラックマジシャン",100);
		//System.out.println("魔法使いの名前を設定してください");
		//mg.name = scan3.nextLine();

		//System.out.println("魔法使いの体力を設定してください");
		//mg.hp = scan3.nextInt();
		
		//System.out.println("魔法使いの攻撃力を設定してください");
		//mg.at = scan3.nextInt();
		
		//System.out.println("魔法使いの魔力を設定してください");
		//mg.mp = scan3.nextInt();
		
		mg.setName("マジシャン");
		mg.setHp(100);
		mg.setMagicAt(30);
		mg.setMp(50);
		
		System.out.println("魔法使いが誕生した");
		System.out.println("名前　；" + mg.getName());
		System.out.println("体力　；" + mg.getHp());
		System.out.println("攻撃力　；" + mg.getMagicAt());
		System.out.println("魔力　；" + mg.getMp());
		System.out.println();
		
		//scan.close();
		//scan2.close();
		//scan3.close();
		
		
		SuperHero a = new SuperHero(h);
		a.setName("スーパー勇者");
		a.setHp(100);
		a.setAt(50);
		a.setDf(100);
		System.out.println("勇者が進化した");
		System.out.println("名前　；" + a.getName());
		System.out.println("体力　；" + a.getHp());
		System.out.println("攻撃力　；" + a.getAt());
		System.out.println("防御力　；" + a.getDf());
		System.out.println();
		
		SuperMagician b = new SuperMagician(mg);
		b.setSuperMagicName("スーパーマジシャン");
		System.out.println("魔法使いが進化した");
		System.out.println("名前　；" + b.getSuperMagicName());
		System.out.println("体力　；" + b.getSuperMagicHp());
		System.out.println("攻撃力　；" + b.getSuperMagicAt());
		System.out.println("魔力　；" + b.getSuperMagicMp());
		System.out.println();
		
		SuperMonster c = new SuperMonster();
		c.setName("スーパーモンスター");
		c.setHp(150);
		c.setAt(30);
		c.setDf(50);
		System.out.println("モンスターが進化した");
		System.out.println("名前　；" + c.getName());
		System.out.println("体力　；" + c.getHp());
		System.out.println("攻撃力　；" + c.getAt());
		System.out.println("魔力　；" + c.getDf());
		System.out.println();
		

		System.out.println("----------------------");
		
		
		while(true) {
			h.attack(m);
			mikata_hp(h,a,mg,b);
			teki_hp(m,c);
			hanntei(h,a,mg,b,m,c);
			System.out.println();
			if(m.getHp()<=0 && c.getHp()<=0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			if(h.getHp()<=0 && a.getHp()<=0 && mg.getHp()<=0 && b.getSuperMagicHp()<=0) {
				System.out.println("ヒーローは全滅した");
				break;
			}
			
			m.attack(mg);
			mikata_hp(h,a,mg,b);
			teki_hp(m,c);
			hanntei(h,a,mg,b,m,c);
			System.out.println();
			if(m.getHp()<=0 && c.getHp()<=0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			if(h.getHp()<=0 && a.getHp()<=0 && mg.getHp()<=0 && b.getSuperMagicHp()<=0) {
				System.out.println("ヒーローは全滅した");
				break;
			}
			
			a.attack(c);
			mikata_hp(h,a,mg,b);
			teki_hp(m,c);
			hanntei(h,a,mg,b,m,c);
			System.out.println();
			if(m.getHp()<=0 && c.getHp()<=0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			if(h.getHp()<=0 && a.getHp()<=0 && mg.getHp()<=0 && b.getSuperMagicHp()<=0) {
				System.out.println("ヒーローは全滅した");
				break;
			}
			
			m.attack(h);
			mikata_hp(h,a,mg,b);
			teki_hp(m,c);
			hanntei(h,a,mg,b,m,c);
			System.out.println();
			if(m.getHp()<=0 && c.getHp()<=0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			if(h.getHp()<=0 && a.getHp()<=0 && mg.getHp()<=0 && b.getSuperMagicHp()<=0) {
				System.out.println("ヒーローは全滅した");
				break;
			}
			
			c.poison_attack(h);
			mikata_hp(h,a,mg,b);
			teki_hp(m,c);
			hanntei(h,a,mg,b,m,c);
			System.out.println();
			if(m.getHp()<=0 && c.getHp()<=0) {
				System.out.println("モンスターは全滅した");
				break;
			}
			if(h.getHp()<=0 && a.getHp()<=0 && mg.getHp()<=0 && b.getSuperMagicHp()<=0) {
				System.out.println("ヒーローは全滅した");
				break;
			}
			
			
			
		}
		
	}
	static void mikata_hp(Hero h, SuperHero a,Magician mg, SuperMagician b) {
		System.out.println(h.getName()+"の残りHP　："+h.getHp());
		System.out.println(a.getName()+"の残りHP　："+a.getHp());
		System.out.println(mg.getName()+"の残りHP　："+mg.getHp());
		System.out.println(b.getSuperMagicName()+"の残りHP　："+b.getSuperMagicHp());
	}
	static void teki_hp(Monster m, SuperMonster c) {
		System.out.println(m.getName()+"の残りHP　："+m.getHp());
		System.out.println(c.getName()+"の残りHP　："+c.getHp());
	}
	static void hanntei(Hero h, SuperHero a,Magician mg, SuperMagician b, Monster m, SuperMonster c) {
		
		if(h.getHp()==0) {
			System.out.println(h.getName()+"は倒された");
		}
		if(a.getHp()==0) {
			System.out.println(a.getName()+"は倒された");
		}
		if(mg.getHp()==0) {
			System.out.println(mg.getName()+"は倒された");
		}
		if(b.getSuperMagicHp()==0) {
			System.out.println(b.getSuperMagicName()+"は倒された");
		}
		if(m.getHp()==0) {
			System.out.println(m.getName()+"は倒された");
		}
		if(c.getHp()==0) {
			System.out.println(c.getName()+"は倒された");
		}else {
			;
		}
	}
}
