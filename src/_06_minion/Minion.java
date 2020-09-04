package _06_minion;

public class Minion {
	
	String name;
	int number;
	String color;
	String empty;
	String master;
Minion(String name, int number, String color, String empty){
	this.name = name;
	this.number = number;
	this.color = color;
	this.empty = empty;
}
public String getName() {
	return name;
}	

public int getEyes() {
	return number;
}

public String getColor() {
	return color;
}

public void setMaster(String master) {
	this.master=master;	
}

public String getMaster() {
	return master;
}
}
