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
				{2,1,3,0,4,24,6,7,22,9,17,14,12,13,11,15,10,21,19,20,18,8,23,5,25,16},
				{0,19,1,2,25,9,17,8,21,5,23,12,15,14,16,13,6,18,3,20,7,22,11,24,4,10}
		};
		Rotator r1 = new Rotator(rotor1, startingPos1);
		
		//Rotor2
		int[][] rotor2 = {
				{4,25,2,17,0,10,19,11,23,9,22,7,15,21,16,13,5,18,6,20,14,1,8,24,3,12},
				{25,10,3,6,18,23,0,7,9,2,5,12,22,14,21,20,17,4,19,16,15,13,11,24,1,8}
		};
		Rotator r2 = new Rotator(rotor2, startingPos2);
		
		//Rotor3
		int[][] rotor3 = {
				{15,1,7,4,12,6,3,8,19,10,11,5,22,14,0,16,18,23,9,20,25,13,17,24,21,2},
				{1,4,7,2,12,6,3,23,11,9,10,5,21,19,24,16,22,18,14,20,13,15,8,17,25,0}
		};
		Rotator r3 = new Rotator(rotor3, startingPos3);
		
		//Reflector
		Map<Character, Character> reflectorMap = new HashMap<Character, Character>();
		reflectorMap.put('A', 'P');
		reflectorMap.put('B', 'V');
		reflectorMap.put('C', 'M');
		reflectorMap.put('D', 'Z');
		reflectorMap.put('E', 'I');
		reflectorMap.put('F', 'T');
		reflectorMap.put('G', 'O');
		reflectorMap.put('H', 'J');
		reflectorMap.put('I', 'E');
		reflectorMap.put('J', 'H');
		reflectorMap.put('K', 'L');
		reflectorMap.put('L', 'K');
		reflectorMap.put('M', 'C');
		reflectorMap.put('N', 'Q');
		reflectorMap.put('O', 'G');
		reflectorMap.put('P', 'A');
		reflectorMap.put('Q', 'N');
		reflectorMap.put('R', 'W');
		reflectorMap.put('S', 'U');
		reflectorMap.put('T', 'F');
		reflectorMap.put('U', 'S');
		reflectorMap.put('V', 'B');
		reflectorMap.put('W', 'R');
		reflectorMap.put('X', 'Y');
		reflectorMap.put('Y', 'X');
		reflectorMap.put('Z', 'D');
		Reflector reflector = new Reflector(reflectorMap);
		
		//Encryptor
		Encryption encryption = new Encryption(r1, r2, r3, reflector);
		
		encryption.encrypt('D');
		r1.rotateRotor();
		encryption.encrypt('K');
		r1.rotateRotor();
		encryption.encrypt('S');
		r1.rotateRotor();
		encryption.encrypt('X');
		r1.rotateRotor();
		encryption.encrypt('P');
		r2.rotateRotor();
		encryption.encrypt('G');


		

	}

}
