package _03_smurf;

public class smurfRunner {
public static void main(String[] args) {
	Smurf smurf = new Smurf("Handy");
	Smurf papa = new Smurf("Papa");
	Smurf smurfette = new Smurf("Smurfette");
	smurf.eat();
	System.out.println(smurf.getName());
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
