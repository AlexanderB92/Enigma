package model;

public class Encryption {
	
	Rotator r1; //Fast rotator
	Rotator r2; //Mid rotator
	Rotator r3; //Slow rotator
	Reflector reflector;
	Character[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	
	public Encryption(Rotator r1, Rotator r2, Rotator r3, Reflector reflector) {
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.reflector = reflector;
	}
	
	public void encrypt(Character letter) {
		
		Character result;
		int currentIndex;
		int alphabetSpace = 0;
		
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == letter) {
				alphabetSpace = i;
			}
		}
		
		currentIndex = r3.rightOutput(r2.rightOutput(r1.rightOutput(alphabetSpace)));
		
		System.out.println(currentIndex);
		
	}
	
	

}
