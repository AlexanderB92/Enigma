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
		int alphabetIndex = getAlphabetIndex(letter);
		
		//First run through rotators
		currentIndex = r3.rightOutput(r2.rightOutput(r1.rightOutput(alphabetIndex)));
		
		//Get current letter from alphabet array and get corresponding reflection and it's index
		Character reflectorLetter = alphabet[currentIndex];
		reflectorLetter = reflector.getReflection(reflectorLetter);
		int reflectorNumber = getAlphabetIndex(reflectorLetter);
		
		//Return through reflectors
		currentIndex = r1.leftOutput(r2.leftOutput(r3.leftOutput(reflectorNumber)));
		
		System.out.println(alphabet[currentIndex]);
		
	}
	
	public int getAlphabetIndex(Character letter) {
		int result = 0;
		
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == letter) {
				result = i;
			}
		}
		
		return result;	
	}
	
	

}
