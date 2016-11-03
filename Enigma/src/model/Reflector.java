package model;

import java.util.Map;

public class Reflector {
	
	Map<Character, Character> reflectorPairs;
	
	public Reflector(Map<Character, Character> reflectorMap) {
		this.reflectorPairs = reflectorMap;
	}
	
	public Character getReflection(Character c) {
		return reflectorPairs.get(c);
		
	}

}
