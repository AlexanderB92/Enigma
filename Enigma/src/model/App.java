package model;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		//STARTING ROTATOR POSITIONS
		int startingPos1 = 0;
		int startingPos2 = 0;
		int startingPos3 = 0;
		
		//Rotor1
		int[][] rotor1 = {
				{2,1,3,0},
				{0,3,1,2}
		};
		Rotator r1 = new Rotator(rotor1, startingPos1);
		
		//Rotor2
		int[][] rotor2 = {
				{0,3,2,1},
				{1,2,3,0}
		};
		Rotator r2 = new Rotator(rotor2, startingPos2);
		
		//Rotor3
		int[][] rotor3 = {
				{2,0,1,3},
				{1,2,0,3}
		};
		Rotator r3 = new Rotator(rotor3, startingPos3);
		
		//Reflector
		Map<Character, Character> reflectorMap = new HashMap();
		
		reflectorMap.put('A', 'B');
		reflectorMap.put('B', 'A');
		reflectorMap.put('C', 'D');
		reflectorMap.put('D', 'C');
		
		Reflector reflector = new Reflector(reflectorMap);
		
		Encryption encryption = new Encryption(r1, r2, r3, reflector);
		
		encryption.encrypt('D');
		

	}

}
