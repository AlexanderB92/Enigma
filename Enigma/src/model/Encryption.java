package model;

public class Encryption {
	
	Rotator r1; //Fast rotator
	Rotator r2; //Mid rotator
	Rotator r3; //Slow rotator
	Reflector reflector;
	Character letter;
	int[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public Encryption(Rotator r1, Rotator r2, Rotator r3, Reflector reflector, Character letter) {
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.reflector = reflector;
		this.letter = letter;
	}
	
	public void encrypt() {
				
		
		
	}
	
	

}
