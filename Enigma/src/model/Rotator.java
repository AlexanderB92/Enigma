package model;

public class Rotator {

	Integer[] rotorValues;
	int currentValue;

	public Rotator(Integer[] rotorVal, int startingValue) {
		this.rotorValues = rotorVal;
		this.currentValue = startingValue;
	}
}
