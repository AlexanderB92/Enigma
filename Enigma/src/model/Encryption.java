package model;

public class Encryption {
	
	Rotator r1;
	Rotator r2;
	Rotator r3;
	Reflector reflector;
	Character letter;
	
	public Encryption(Rotator r1, Rotator r2, Rotator r3, Reflector reflector, Character letter) {
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.reflector = reflector;
		this.letter = letter;
	}

}
