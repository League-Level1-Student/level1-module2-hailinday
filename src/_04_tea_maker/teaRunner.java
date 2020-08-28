package _04_tea_maker;

public class teaRunner {
public static void main(String[] args) {
	TeaBag bag = new TeaBag("mint");
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	System.out.println(bag.getFlavor());
	System.out.println(kettle.getWater());
	kettle.boil();
	cup.makeTea(bag, kettle.getWater());
}
}
