package model;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		//Rotor1
		int[][] rotor1 = {
				{2,4},
				{1,3},
				{3,1},
				{4,2}
		};
		Rotator r1 = new Rotator(rotor1, 0);
		
		//Rotor2
		int[][] rotor2 = {
				{4,1},
				{3,2},
				{2,3},
				{1,4}
		};
		
		//Rotor3
		int[][] rotor3 = {
				{2,1},
				{4,2},
				{2,4},
				{3,3}
		};
		
		//Reflector
		Map<Character, Character> reflectorMap = new HashMap();
		
		reflectorMap.put('A', 'B');
		reflectorMap.put('B', 'A');
		reflectorMap.put('C', 'D');
		reflectorMap.put('D', 'C');

	}

}
