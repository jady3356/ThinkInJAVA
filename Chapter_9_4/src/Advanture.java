//:Advanture.java

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanMove {
	void run();
	void walk();
}

interface BasicMan extends CanMove, CanSwim{
	void Human();
}

interface SuperMan extends CanMove, CanFly {
	void SuperMankind();
}

class ActionCharacter {
	public void fight() {System.out.println("ActionCharacter.fight()");}
}

class Hero extends ActionCharacter 
	implements CanFight, CanSwim, CanFly {
	public void swim() {System.out.println("Hero.swim()");}
	public void fly() {System.out.println("Hero.fly()");}
}

public class Advanture {
	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x) {x.swim();}
	public static void v(CanFly x) {x.fly();}
	public static void w(ActionCharacter x) {x.fight();}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
