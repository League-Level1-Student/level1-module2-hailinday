package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature sponge =  new SeaCreature("spongebob");
	SeaCreature squid =  new SeaCreature("squidward");
	SeaCreature pat =  new SeaCreature("patrick");
	sponge.eat();
	System.out.println(squid.getName());
	System.out.println(pat.getName());
	squid.eat();
	pat.eat();
	squid.laugh();
	pat.laugh();
	
}
}
